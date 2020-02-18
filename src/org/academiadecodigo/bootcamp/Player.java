package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player implements KeyboardHandler {

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


    @Override
    public void keyPressed(KeyboardEvent e) {

            System.out.println("key is: " + e.getKey());
        switch(e.getKey()) {


            case KeyboardEvent.KEY_RIGHT:
                System.out.println("Rigth");
                if (cellPlayer.getCol() != field.getCols() -1) {
                    cellPlayer.setCol(1);
                    rectPlayer.translate(cellPlayer.CELLSIZE, 0);
                }
                 break;

            case KeyboardEvent.KEY_DOWN:
                System.out.println("hello" + cellPlayer.getRow());
                if (cellPlayer.getRow() != field.getRows() -1) {
                    cellPlayer.setRow(1);
                    rectPlayer.translate( 0, cellPlayer.CELLSIZE);
                }
                break;
            case KeyboardEvent.KEY_LEFT:
                System.out.println("Left");
                if (cellPlayer.getCol() != 0) {
                 cellPlayer.setCol(-1);
                 rectPlayer.translate(-cellPlayer.CELLSIZE, 0);
                }
                 break;


            case KeyboardEvent.KEY_UP:
                System.out.println("UP");
                if (cellPlayer.getRow() != 0) {
                 cellPlayer.setRow(-1);
                 rectPlayer.translate( 0, -cellPlayer.CELLSIZE);
                }
                 break;

            case KeyboardEvent.KEY_SPACE:

                Rectangle rectField = field.getCell(cellPlayer.getCol(), cellPlayer.getRow()).getRect();

                if (!(rectField.isFilled())) {
                    rectField.fill();
                } else {
                    rectField.draw();
                }

                break;

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        /**
         * Not Implemented
         */
    }

}
