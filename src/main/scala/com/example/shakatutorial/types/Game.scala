package com.example.shakatutorial.types

import org.getshaka.nativeconverter.NativeConverter

case class Game(
  xIsNext: Boolean,
  stepNumber: Int,
  history: IArray[IArray[SquareValue]]
) derives NativeConverter