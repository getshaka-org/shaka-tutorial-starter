package com.example.shakatutorial

import org.getshaka.shaka.*

class Square extends Component:
  override def template: Frag = Frag:
    import builders.*
    
    button:
      className("square")
      // todo
