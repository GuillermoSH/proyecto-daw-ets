package es.iespuerto.ets;

import java.util.logging.Handler;

/**
 * Clase para la obtención de señales entrantes mediante el teclado
 * @param handler handler del objeto Handler de java
 * @param keydown booleano sobre el teclado
 * @author Guillermo Sicilia Hernández
 * @version 0.1
 */
public class Keyinput {
    private Handler handler;
    private boolean keydown;
    /**
     * Constructor con 2 parámetros
     * @param handler handler del objeto Handler de java
     * @param keydown booleano sobre el teclado
     */
    public Keyinput(Handler handler, boolean keydown) {
        this.handler = handler;
        this.keydown = keydown;
    }
    /**
     * Getter del parámetro Handler
     * @return handler
     */
    public Handler getHandler() {
        return handler;
    }
    /**
     * Setter del parámetro handler
     * @param handler handler del objeto Handler de java
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    /**
     * Getter del parámetro keydown
     * @return keydown
     */
    public boolean isKeydown() {
        return keydown;
    }
    /**
     * Setter del parámetro keydown
     * @param keydown booleano sobre el teclado
     */
    public void setKeydown(boolean keydown) {
        this.keydown = keydown;
    }

}
