package org.example;

import javax.swing.*;
import java.awt.*;


public class GameBoard extends JComponent {

  public GameBoard() {
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    ImageContainer floor =  new ImageContainer("images/Floor.png.", 0, 0);
    floor.draw(graphics);
  }
}
