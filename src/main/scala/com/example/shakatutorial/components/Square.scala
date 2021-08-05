package com.example.shakatutorial.components

import com.example.shakatutorial.state.GameState
import org.getshaka.shaka
import org.getshaka.shaka.{Component, ComponentBuilder}

class Square(position: Int) extends Component:
  override val template: ComponentBuilder =
    import shaka.builders.{position as _, *}

    button{className("square"); onclick(() => GameState.setSquare(position))
      GameState.bind(s => s.history(s.stepNumber)(position).display.t)
    }
