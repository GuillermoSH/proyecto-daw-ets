package es.iespuerto.ets;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Keyinput extends KeyAdapter {
    private Handler handler;

    public Keyinput(Handler handler) {
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {

        int Key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                // key events for player 1

                if (Key == KeyEvent.VK_W)
                    tempObject.setvelY(-5);
                if (Key == KeyEvent.VK_S)
                    tempObject.setvelY(5);
                if (Key == KeyEvent.VK_D)
                    tempObject.setvelY(5);
                if (Key == KeyEvent.VK_A)
                    tempObject.setvelY(-5);

            }
        }
    }

    public void KeyReleased(KeyEvent e) {
        int Key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                // key events for player 1

                if (Key == KeyEvent.VK_W)
                    tempObject.setvelY(-0);
                if (Key == KeyEvent.VK_S)
                    tempObject.setvelY(0);
                if (Key == KeyEvent.VK_D)
                    tempObject.setvelX(0);
                if (Key == KeyEvent.VK_A)
                    tempObject.setvelX(0);

            }

        }

    }
}