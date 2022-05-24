package es.iespuerto.ets;

import java.awt.*;

/**
 * Clase que se va a encargar de transformar todos los elementos que aparezca en
 * el juego en objetos (necesitan un ID).
 */
public abstract class GameObject {
    protected int x;
    protected int y;
    protected ID id;
    protected int velX;
    protected int velY;

    /**
     * Constructor para GameObject , los parametros
     * que se insertan en el metodo son los de la propia clase
     * de manera automatica.
     * 
     * @param x  vector x de posicion del objeto
     * @param y  vector y de posicion del objeto
     * @param id identificador del objeto
     */
    protected GameObject(int x, int y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();

    public abstract void render(Graphics g);
}
