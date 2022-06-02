package es.iespuerto.ets;

import java.awt.Graphics;
import java.util.*;

/**
 * Handler permite enviar y procesar objetos Message y Runnable asociados con
 * MessageQueue de un thread.
 * 
 * crea una lista tambien crea y modifica o elimna los GameObjects
 * 
 * @author GuillermoSH
 */
public class Handler {

    List<GameObject> object = new LinkedList<>();

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
    public boolean addObject(GameObject object) {
        if (!this.object.contains(object)){
            this.object.add(object);
            return true;
        }
        return false;
    }

    /**
     * Metodo que elimina objectos a la lista
     */
    public boolean removeObject(GameObject object) {
        if (this.object.contains(object)){
            this.object.remove(object);
            return true;
        }
        return false;
    }

    public List<GameObject> getObjects() {
        return object;
    }
}
