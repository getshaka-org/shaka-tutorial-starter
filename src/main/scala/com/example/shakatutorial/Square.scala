package com.example.shakatutorial

import org.getshaka.shaka
import org.getshaka.shaka.{Component, ComponentBuilder}

class Square extends Component:
  override val template: ComponentBuilder =
    import shaka.builders.*
    
    button {
      className("square")
      // todo
    }
