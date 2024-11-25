package org.example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {

  private GameBoard gameBoard;

  public Controller(GameBoard gameBoard) {
    this.gameBoard = gameBoard;
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      // Do something
    }

    gameBoard.repaint();
  }
}
