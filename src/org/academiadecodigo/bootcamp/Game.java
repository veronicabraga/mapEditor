package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public class Game {

    private Player player;
    private Field field;
    private KeyboardInteraction KInteraction;

    public Game() {
        field = new Field(10, 10);
        player = new Player(field);
        KInteraction = new KeyboardInteraction(player, field);
        keyboardPresses();



    }

    public void keyboardPresses() {

        Keyboard k = new Keyboard(KInteraction);


        KeyboardEvent eventRight = new KeyboardEvent();
        eventRight.setKey(KeyboardEvent.KEY_RIGHT);
        eventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventRight);

        KeyboardEvent eventLeft = new KeyboardEvent();
        eventLeft.setKey(KeyboardEvent.KEY_LEFT);
        eventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventLeft);

        KeyboardEvent eventUp = new KeyboardEvent();
        eventUp.setKey(KeyboardEvent.KEY_UP);
        eventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventUp);

        KeyboardEvent eventDown = new KeyboardEvent();
        eventDown.setKey(KeyboardEvent.KEY_DOWN);
        eventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventDown);

        KeyboardEvent eventPrintClean = new KeyboardEvent();
        eventPrintClean.setKey(KeyboardEvent.KEY_SPACE);
        eventPrintClean.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventPrintClean);

        KeyboardEvent eventCleanAll = new KeyboardEvent();
        eventCleanAll.setKey(KeyboardEvent.KEY_C);
        eventCleanAll.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventCleanAll);

        KeyboardEvent eventSave = new KeyboardEvent();
        eventSave.setKey(KeyboardEvent.KEY_B);
        eventSave.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventSave);

        KeyboardEvent eventReprint = new KeyboardEvent();
        eventReprint.setKey(KeyboardEvent.KEY_R);
        eventReprint .setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventReprint);


    }
}
