package com.example.shakatutorial

import com.example.shakatutorial.components.TicTac
import org.getshaka.shaka

@main def launchApp(): Unit =
  shaka.render(TicTac())