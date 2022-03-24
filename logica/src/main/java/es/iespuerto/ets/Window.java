package es.iespuerto.ets;

/**
 * Clase que genera la pantalla en la que se va a ver el videojuego que se estara ejecutando
 * @param title titulo del videojuego
 * @param width ancho de la pantalla
 * @param height alto de la pantalla
 * @author Guillermo Sicilia Hernandez
 * @version 0.1
 */
public class Window {
    public String title;
    public int width,height;
    
    /**
     * Constructor con los 3 parametros de la clase
     * @param title titulo del videojuego
     * @param width ancho de la pantalla
     * @param height alto de la pantalla
     */
    public Window(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }
    /**
     * Getter del parametro title
     * @return title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Setter del parametro title
     * @param title titulo del videojuego
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Getter del parametro width
     * @return width
     */
    public int getWidth() {
        return width;
    }
    /**
     * Setter del parametro width
     * @param width ancho de la pantalla
     */
    public void setWidth(int width) {
        this.width = width;
    }
    /**
     * Getter del parametro height
     * @return height
     */
    public int getHeight() {
        return height;
    }
    /**
     * Setter del parametro height
     * @param height altura de la pantalla
     */
    public void setHeight(int height) {
        this.height = height;
    }

}
