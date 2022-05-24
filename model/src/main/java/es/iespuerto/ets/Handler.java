package es.iespuerto.ets;

import java.util.*;
import java.awt.Graphics;

/**
 * Handler permite enviar y procesar objetos Message y Runnable asociados con
 * MessageQueue de un thread.
 * 
 * crea una lista tambien crea y modifica o elimna los GameObjects
 */
public class Handler {
    private List<GameObject> objects = new LinkedList<>();

    public void tick() {
        for (int i = 0; i < objects.size(); i++) {
            GameObject tempObject = objects.get(i);

            tempObject.tick();
        }
    }

    public void render(Graphics g) {
        for (int i = 0; i < objects.size(); i++) {
            GameObject tempObject = objects.get(i);

            tempObject.render(g);
        }
    }

    public List<GameObject> getObjects() {
        return this.objects;
    }

    /**
     * Metodo que añade objectos a la lista
     * 
     * @param object
     */
    public void addObject(GameObject object) {
        this.objects.add(object);
    }

    /**
     * Metodo que elimina objectos a la lista
     */
    public void removeObject(GameObject object) {
        this.objects.remove(object);
    }
}
