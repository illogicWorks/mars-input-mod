package me.plopez.inputmod;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Keyboard {

    private static final boolean[] pressedKeys = new boolean[65536];

    
    static {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(event -> {
            synchronized (Keyboard.class) {
                if (event.getID() == KeyEvent.KEY_PRESSED) pressedKeys[event.getKeyChar()] = true;
                else if (event.getID() == KeyEvent.KEY_RELEASED) pressedKeys[event.getKeyChar()] = false;
                return false;
            }
        });
    }

    public static boolean isKeyPressed(char keyChar) { // Any key code from the KeyEvent class
        return pressedKeys[keyChar];
    }
}