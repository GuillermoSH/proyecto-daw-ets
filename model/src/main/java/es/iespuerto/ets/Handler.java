package es.iespuerto.ets;

import java.awt.Graphics;
import java.util.LinkedList;

/**
 * Handler permite enviar y procesar objetos Message y Runnable asociados con
 * MessageQueue de un thread.
 * 
 * crea una lista tambien crea y modifica o elimna los GameObjects
 */
public class Handler {

    LinkedList<GameObject> object = new LinkedList<>();

    public void tick() {
        for (int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);

            tempObject.tick();
        }
    }

    public void render(Graphics g) {
        for (int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);

            tempObject.render(g);
        }
    }

    /**
     * Metodo que añade objectos a la lista
     * 
     * @param object
     */
    public void addObject(GameObject object) {
        this.object.add(object);
    }

    /**
     * Metodo que elimina objectos a la lista
     */
    public void removeObject(GameObject object) {
        this.object.remove(object);
    }
}
