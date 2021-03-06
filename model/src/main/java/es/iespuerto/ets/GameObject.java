package es.iespuerto.ets;

import java.awt.Graphics;

/**
 * Clase que se va a encargar de transformar
 * todos los elementos que aparezca en el juego
 * en objetos (necesitan un ID).
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
    public GameObject(int x, int y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    /**
     * seters and getters para modificar y obtener valor de
     * las propiedades de movimiento posicion e identificador los GameObject
     * 
     * @return retorna x
     */
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public int getvelX() {
        return velX;
    }

    public void setvelX(int velX) {
        this.velX = velX;
    }

    public int getvelY() {
        return velY;
    }

    public void setvelY(int velY) {
        this.velY = velY;
    }

}
