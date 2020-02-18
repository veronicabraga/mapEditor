package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.io.IOException;

public class KeyboardInteraction implements KeyboardHandler {

    private Player player;
    private Field field;

    public KeyboardInteraction(Player player, Field field){
        this.player = player;
        this.field = field;
    }


    @Override
    public void keyPressed(KeyboardEvent e) {

        System.out.println("key is: " + e.getKey());
        switch(e.getKey()) {


            case KeyboardEvent.KEY_RIGHT:
                player.moveRight();
                break;

            case KeyboardEvent.KEY_DOWN:
                player.moveDown();
                break;

            case KeyboardEvent.KEY_LEFT:
                player.moveLeft();
                break;

            case KeyboardEvent.KEY_UP:
                player.moveUp();
                break;

            case KeyboardEvent.KEY_SPACE:
                player.printClear();
                break;

            case KeyboardEvent.KEY_C:
                field.clearField();
                break;

            case KeyboardEvent.KEY_B:

                try {

                    field.writeFileByLine("/Users/codecadet/workspace/mapEditor/FieldDraw");

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                break;

            case KeyboardEvent.KEY_R:
                try {
                    String result = field.readFileByLine("/Users/codecadet/workspace/mapEditor/FieldDraw");
                    field.rePrint(result);

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        /** nothing to implement
         * //
         */
    }
}
