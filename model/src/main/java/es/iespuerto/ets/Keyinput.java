package es.iespuerto.ets;

import java.awt.event.*;

/**
 * @author GuillermoSH
 */
public class Keyinput extends KeyAdapter {
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        System.out.println(key);
    }

    public void KeyReleased(KeyEvent e) {

    }
}