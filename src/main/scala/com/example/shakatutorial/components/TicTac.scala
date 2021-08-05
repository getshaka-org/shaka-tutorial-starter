package com.example.shakatutorial.components

import com.example.shakatutorial.components.TicTac.*
import com.example.shakatutorial.state.GameState
import com.example.shakatutorial.types.SquareValue.*
import com.example.shakatutorial.util.calculateWinner
import org.getshaka.shaka
import org.getshaka.shaka.{Component, ComponentBuilder, ShadowDom, WebComponent}

class TicTac extends WebComponent:

  override val shadowDom: ShadowDom = TicTacStyles

  override val template: ComponentBuilder =
    import shaka.builders.*

    val status: ComponentBuilder =
      GameState.bind(s => calculateWinner(s.history(s.stepNumber)) match
        case X => t"Winner: X"
        case O => t"Winner: O"
        case Empty => t"NextPlayer: ${if s.xIsNext then "X" else "O"}"
      )

    val moves: ComponentBuilder =
      GameState.bind(_.history.indices.foreach(move =>
        val desc =
          if move > 0 then "Go to move #" + move
          else "Go to game start"
        li{button{onclick(() => GameState.jumpTo(move)); desc.t}}
      ))

    div{className("game")
      div{className("game-board")
        Board().render
      }
      div{className("game-info")
        div{status}
        ol{moves}
      }
    }

object TicTac:
  private val TicTacStyles = ShadowDom.WithStyle(
    // language=CSS
    """
      |
      |ol, ul {
      |  padding-left: 30px;
      |}
      |
      |.board-row:after {
      |  clear: both;
      |  content: "";
      |  display: table;
      |}
      |
      |.status {
      |  margin-bottom: 10px;
      |}
      |
      |.square {
      |  background: #fff;
      |  border: 1px solid #999;
      |  float: left;
      |  font-size: 24px;
      |  font-weight: bold;
      |  line-height: 34px;
      |  height: 34px;
      |  margin-right: -1px;
      |  margin-top: -1px;
      |  padding: 0;
      |  text-align: center;
      |  width: 34px;
      |}
      |
      |.square:focus {
      |  outline: none;
      |}
      |
      |.kbd-navigation .square:focus {
      |  background: #ddd;
      |}
      |
      |.game {
      |  display: flex;
      |  flex-direction: row;
      |}
      |
      |.game-info {
      |  margin-left: 20px;
      |}
      |""".stripMargin
  )
