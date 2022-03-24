package es.iespuerto.ets;

/**
 * Clase que se encarga de que todo lo que se encuentra en el juego sea un
 * objeto
 * 
 * @author Jonathan
 * @param x,y,veIX,veIY ubicaciones en el entorno grafico de los objetos
 * @param id            para referenciar objetos
 */
public class GameObject {
    protected int x, y, veIX, veIY;
    protected ID id;

    /**
     * Constructor que se encarga se crear objetos
     * 
     * @param x    referencia a propiedad de la clase
     * @param y    referencia a propiedad de la clase
     * @param veIX referencia a propiedad de la clase
     * @param veIY referencia a propiedad de la clase
     * @param id   referencia a propiedad de la clase
     */
    public GameObject(int x, int y, int veIX, int veIY, ID id) {
        this.x = x;
        this.y = y;
        this.veIX = veIX;
        this.veIY = veIY;
        this.id = id;
    }

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

    public int getVeIX() {
        return veIX;
    }

    public void setVeIX(int veIX) {
        this.veIX = veIX;
    }

    public int getVeIY() {
        return veIY;
    }

    public void setVeIY(int veIY) {
        this.veIY = veIY;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

}
