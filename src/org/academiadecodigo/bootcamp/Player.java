package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player implements KeyboardHandler {

    private Position position;
    private Rectangle rectPlayer;
    private Cell cellPlayer;
    private Field field;

    public Player(Field field) {
        position = new Position(0, 0);
        cellPlayer = new Cell(10, 10);
        cellPlayer.getRect().fill();
        rectPlayer = cellPlayer.getRect();
        this.field = field;
    }


    @Override
    public void keyPressed(KeyboardEvent e) {

        switch(e.getKey()) {

            case KeyboardEvent.KEY_RIGHT:
                if (position.getCol() != field.getCols() -1) {
                    position.setCol(1);
                    rectPlayer.translate(cellPlayer.getCellSize(), 0);
                }
                 break;

            case KeyboardEvent.KEY_LEFT:
                if (position.getCol() != 0) {
                 position.setCol(-1);
                 rectPlayer.translate(-cellPlayer.getCellSize(), 0);
                }
                 break;

            case KeyboardEvent.KEY_DOWN:
                if (position.getRow() != field.getRows() -1) {
                 position.setRow(1);
                 rectPlayer.translate( 0, cellPlayer.getCellSize());
                }
                 break;

            case KeyboardEvent.KEY_UP:
                if (position.getRow() != 0) {
                 position.setRow(-1);
                 rectPlayer.translate( 0, -cellPlayer.getCellSize());
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
