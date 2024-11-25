package org.example;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Nix Space Transporter");
    GameBoard gameBoard = new GameBoard();
    Controller controller = new Controller(gameBoard);
    frame.add(gameBoard);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(controller);
  }
}
