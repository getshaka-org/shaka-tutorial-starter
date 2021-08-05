package com.example.shakatutorial.state

import com.example.shakatutorial.types.Game
import com.example.shakatutorial.types.SquareValue.*
import com.example.shakatutorial.util.calculateWinner
import org.getshaka.shaka.{LocalStorage, State}

object GameState extends State(Game(true, 0, IArray(IArray.fill(9)(Empty))), LocalStorage("game-state")):

  def setSquare(position: Int): Unit =
    val hist = value.history.slice(0, value.stepNumber + 1)
    val currBoardState = hist.last
    if currBoardState(position) != Empty || calculateWinner(currBoardState) != Empty
    then return

    val newBoardState = currBoardState.updated(position, if value.xIsNext then X else O)
    setValue(value.copy(
      xIsNext = !value.xIsNext,
      stepNumber = hist.length,
      history = hist :+ newBoardState
    ))

  def jumpTo(step: Int): Unit =
    setValue(value.copy(
      stepNumber = step,
      xIsNext = (step % 2) == 0
    ))
