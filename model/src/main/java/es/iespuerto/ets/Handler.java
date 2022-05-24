package es.iespuerto.ets;

import java.util.*;
import java.awt.Graphics;

/**
 * Handler permite enviar y procesar objetos Message y Runnable asociados con
 * MessageQueue de un thread.
 * 
 * Crea una lista tambien en la que se crean y modifican o elimnan los
 * GameObjects
 * 
 * @author Jonathan
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

    /**
     * Getter de la variable miembro objects
     * 
     * @return la lista de objetos GameObjects
     */
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
