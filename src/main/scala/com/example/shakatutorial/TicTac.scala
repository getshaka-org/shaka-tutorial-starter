package com.example.shakatutorial

import org.getshaka.shaka
import org.getshaka.shaka.{Component, ComponentBuilder, ShadowDom, WebComponent}
import com.example.shakatutorial.Board
import TicTac.*

class TicTac extends WebComponent:
  override val shadowDom: ShadowDom = TicTacStyles

  override val template: ComponentBuilder =
    import shaka.builders.*

    div{className("game")
      div{className("game-board")
        Board().render
      }
      div{className("game-info")
        div{/* status */}
        ol{/* todo */}
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
