package com.example.shakatutorial

import org.getshaka.shaka
import org.getshaka.shaka.{Component, ComponentBuilder}
import com.example.shakatutorial.Square

class Board extends Component:
  override val template: ComponentBuilder =
    import shaka.builders.*

    def renderSquare(i: Int): ComponentBuilder =
      Square().render

    val status = "Next player: X"

    div{
      div{className("status"); status.t}
      div{className("board-row")
        renderSquare(0)
        renderSquare(1)
        renderSquare(2)
      }
      div{className("board-row")
        renderSquare(3)
        renderSquare(4)
        renderSquare(5)
      }
      div{className("board-row")
        renderSquare(6)
        renderSquare(7)
        renderSquare(8)
      }
    }
  end template
