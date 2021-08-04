package com.example.shakatutorial

import org.getshaka.shaka.*
import org.scalajs.dom.*

class TicTac extends WebComponent:

  override def template: Frag = Frag:
    import builders.*

    div:
      className("game")
      div:
        className("game-board")
        Board().render
      div:
        className("game-info")
        div{/* status */}
        ol{/* todo */}

  override def shadowDom: ShadowDom = ShadowDom.WithStyle(
    """
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

