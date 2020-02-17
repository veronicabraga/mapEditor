package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player implements KeyboardHandler {

    private Position position;
    private Rectangle rectPlayer;
    private Cell cellPlayer;

    public Player() {
        position = new Position(0, 0);
        cellPlayer = new Cell(10, 10);
        cellPlayer.getRect().fill();
        rectPlayer = cellPlayer.getRect();
    }


    @Override
    public void keyPressed(KeyboardEvent e) {

        switch(e.getKey()) {

            case KeyboardEvent.KEY_RIGHT:
                 position.setCol(1);
                 rectPlayer.translate(cellPlayer.getCellSize(), 0);
                 break;

            case KeyboardEvent.KEY_LEFT:
                 position.setCol(-1);
                 rectPlayer.translate(-cellPlayer.getCellSize(), 0);
                 break;

            case KeyboardEvent.KEY_DOWN:
                 position.setRow(1);
                 rectPlayer.translate( 0, cellPlayer.getCellSize());
                 break;

            case KeyboardEvent.KEY_UP:
                 position.setRow(-1);
                 rectPlayer.translate( 0, -cellPlayer.getCellSize());
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
