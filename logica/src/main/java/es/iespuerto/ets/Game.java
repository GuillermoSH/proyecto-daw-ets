package es.iespuerto.ets;

import java.net.Proxy.Type;

/**
 * Esta es la clase principal del juego y se encarga de referencias los objetos
 * que en el aparecen
 * 
 * @author Jonathan
 * @param serialVersionUID id de la sesion del juego
 * @param field            area donde se despliega el juego
 * @param width            ancho
 */

public class Game {
    private long serialVersionUID;
    private int width;
    public Type field;

    /**
     * Constructor que se encarga de desarrollar y lanzar el juego
     * 
     * @param serialVersionUID se refiera a la propiedad de la clase
     * @param width            se refiere al ancho que tendra el juego
     * @param field            el area donde se despliega el juego
     */
    public Game(long serialVersionUID, int width, Type field) {
        this.serialVersionUID = serialVersionUID;
        this.width = width;
        this.field = field;
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Type getField() {
        return field;
    }

    public void setField(Type field) {
        this.field = field;
    }

}
