package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player {

    //private Position position;
    private Rectangle rectPlayer;
    private Cell cellPlayer;
    private Field field;

    public Player(Field field) {

        cellPlayer = new Cell(5, 5);
        cellPlayer.getRect().fill();
        rectPlayer = cellPlayer.getRect();
        this.field = field;
    }


    public void moveRight() {
        if (cellPlayer.getCol() != field.getCols() -1) {
            cellPlayer.setCol(1);
            rectPlayer.translate(cellPlayer.CELLSIZE, 0);
        }

    }

    public void moveLeft() {
        if (cellPlayer.getCol() != 0) {
            cellPlayer.setCol(-1);
            rectPlayer.translate(-cellPlayer.CELLSIZE, 0);
        }
    }

    public void moveUp() {
        if (cellPlayer.getRow() != 0) {
            cellPlayer.setRow(-1);
            rectPlayer.translate( 0, -cellPlayer.CELLSIZE);
        }
    }

    public void moveDown() {
        if (cellPlayer.getRow() != field.getRows() -1) {
            cellPlayer.setRow(1);
            rectPlayer.translate( 0, cellPlayer.CELLSIZE);
        }
    }

    public void printClear() {
        Rectangle rectField = field.getCell(cellPlayer.getCol(), cellPlayer.getRow()).getRect();

        if (!(rectField.isFilled())) {
            rectField.fill();
        } else {
            rectField.draw();
        }
    }


}
