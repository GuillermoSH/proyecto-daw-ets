package es.iespuerto.ets;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

/**
 * Es una clase que maneja las entradas clave para el juego.
 * 
 * @author GuillermoSH
 */
public class Keyinput extends KeyAdapter {
    private Handler handler;

    // Un constructor que toma un controlador como parámetro.
    public Keyinput(Handler handler) {
        this.handler = handler;
    }

    /**
     * "Si la tecla presionada es W, S, D o A, entonces la velocidad del jugador se establece en 5 o
     * -5".
     * 
     * @param e Evento clave
     */
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

    /**
     * Cuando se suelta la tecla, la velocidad del jugador se establece en 0.
     * 
     * @param e Evento clave
     */
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