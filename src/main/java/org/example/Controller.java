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
      gameBoard.heroMoveUp();
    }
    else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      gameBoard.heroMoveDown();
    }
    else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      gameBoard.heroMoveLeft();
    }
    else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      gameBoard.heroMoveRight();
    }

    gameBoard.repaint();
  }
}
