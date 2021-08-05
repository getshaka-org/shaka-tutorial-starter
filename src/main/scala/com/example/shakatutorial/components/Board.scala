package com.example.shakatutorial.components

import org.getshaka.shaka
import org.getshaka.shaka.{Component, ComponentBuilder}

class Board extends Component:
  override val template: ComponentBuilder =
    import shaka.builders.*

    def renderSquare(i: Int): ComponentBuilder =
      Square(position = i).render

    div{
      for i <- 0 until 9 by 3 do
        div{className("board-row")
          renderSquare(i)
          renderSquare(i + 1)
          renderSquare(i + 2)
        }
    }
