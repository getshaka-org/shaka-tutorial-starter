package com.example.shakatutorial

import org.getshaka.shaka.*

class Board extends Component:
  override val template = Frag {
    import builders.*

    val status = "Next player: X"

    div{
      div{className("status"); status.t}
      div{className("board-row")
        Square().render
        Square().render
        Square().render
      }
      div{className("board-row")
        Square().render
        Square().render
        Square().render
      }
      div{className("board-row")
        Square().render
        Square().render
        Square().render
      }
    }
  }
