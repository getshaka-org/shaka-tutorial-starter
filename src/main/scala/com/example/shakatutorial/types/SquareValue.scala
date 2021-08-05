package com.example.shakatutorial.types

enum SquareValue(val display: String):
  case X extends SquareValue("X")
  case O extends SquareValue("O")
  case Empty extends SquareValue("")

