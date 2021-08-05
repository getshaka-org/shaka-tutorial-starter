package com.example.shakatutorial.util

import com.example.shakatutorial.types.SquareValue
import com.example.shakatutorial.types.SquareValue.*

private val lines = IArray(
  IArray(0, 1, 2),
  IArray(3, 4, 5),
  IArray(6, 7, 8),
  IArray(0, 3, 6),
  IArray(1, 4, 7),
  IArray(2, 5, 8),
  IArray(0, 4, 8),
  IArray(2, 4, 6)
)

def calculateWinner(boardState: IArray[SquareValue]): SquareValue =
  for IArray(a, b, c) <- lines do
    if
      boardState(a) != Empty &&
        boardState(a) == boardState(b) &&
        boardState(a) == boardState(c)
    then return boardState(a)
  return Empty

