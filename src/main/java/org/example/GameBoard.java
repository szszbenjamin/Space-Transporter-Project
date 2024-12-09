package org.example;

import javax.swing.*;
import java.awt.*;


public class GameBoard extends JComponent {

    private final int blockSize = 70;
    private final int numberOfTiles = 10;
    private final String imageDirectoryName = "images";

    Box[] boxes = new Box[4];
    Hero hero;

    public GameBoard() {
        //Setting starting positions
        boxes[0] = new Box(1,1);
        boxes[1] = new Box(2,7);
        boxes[2] = new Box(2,8);
        boxes[3] = new Box(6,6);
        hero = new Hero(0, 0);

        setPreferredSize(new Dimension(numberOfTiles * blockSize, numberOfTiles * blockSize));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        //DRAWING THE MAP

        //0 = floor
        //x = the x. wall
        //17 = Gate   18 = Loading-Area-Marker

        int[][] board = {
                {0, 0, 0, 0, 0, 0, 5, 16, 0, 0},
                {0, 0, 12, 0, 0, 0, 14, 0, 18, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 15, 16, 0, 15, 16, 0, 12, 0},
                {12, 0, 0, 17, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 12, 0, 12, 0, 0},
                {0, 0, 15, 16, 0, 0, 18, 0, 0, 0},
                {0, 0, 0, 0, 0, 13, 0, 0, 0, 0},
                {0, 13, 0, 0, 0, 1, 0, 0, 12, 0},
                {15, 7, 17, 0, 0, 14, 0, 0, 18, 18},};

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                switch (board[y][x]) {
                    case 0:
                        drawImage(graphics, "Floor.png", x, y);
                        break;
                    case 17:
                        drawImage(graphics, "Gate.png", x, y);
                        drawImage(graphics, "Floor.png", x, y);
                        break;
                    case 18:
                        drawImage(graphics, "Loading-Area-Marker.png", x, y);
                        drawImage(graphics, "Floor.png", x, y);
                        break;
                    default: //case 1-16:
                        drawImage(graphics, "wall/Wall-" + board[y][x] + ".png", x, y);
                }
            }
        }


        for (int i = 0; i < 4; i++) {
            drawImage(graphics, "Box-C.png", boxes[i].x, boxes[i].y);
        }

        drawImage(graphics, hero.directionImage, hero.x, hero.y);
    }

    private void drawImage(Graphics graphics, String fileName, int positionX, int positionY) {
        ImageContainer image = new ImageContainer(imageDirectoryName + "/" + fileName, positionX * blockSize, positionY * blockSize);
        image.draw(graphics);
    }

    //Movement of the astronaut
    public void heroMoveUp() {
        hero.y -= 1;
        hero.directionImage = "Hero-Back.png";
    }
    public void heroMoveDown() {
        hero.y += 1;
        hero.directionImage = "Hero-Front.png";
    }
    public void heroMoveLeft() {
        hero.x -= 1;
        hero.directionImage = "Hero-Left.png";
    }
    public void heroMoveRight() {
        hero.x += 1;
        hero.directionImage = "Hero-Right.png";
    }
}
