package es.iespuerto.ets;

import java.util.logging.Handler;

/**
 * Clase que genera la zona de "Spawn" de los jugadores dentro de la zona en el
 * juego
 * 
 * @author Guillermo Sicilia Hernandez
 */
public class Spawn {
    private Handler handler;
    private HUD hud;
    private Random random;

    /**
     * Constructor con los parametros de la clase
     * 
     * @param handler handler del objeto Handler de java
     * @param hud     hud de la pantalla
     * @param random  generacion aleatoria de los jugadores
     */
    public Spawn(Handler handler, HUD hud, Random random) {
        this.handler = handler;
        this.hud = hud;
        this.random = random;
    }

    /**
     * Getter del parametro handler
     * 
     * @return handler
     */
    public Handler getHandler() {
        return handler;
    }

    /**
     * Setter del parametro handler
     * 
     * @param handler handler del objeto Handler de java
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * Getter del parametro hud
     * 
     * @return hud
     */
    public HUD getHud() {
        return hud;
    }

    /**
     * Setter del parametro hud
     * 
     * @param hud hud de la pantalla
     */
    public void setHud(HUD hud) {
        this.hud = hud;
    }

    /**
     * Getter de parametro Random
     * 
     * @return Random
     */
    public Random getRandom() {
        return random;
    }

    /**
     * Setter del parametro Random
     * 
     * @param random generacion aleatoria de los jugadores
     */
    public void setRandom(Random random) {
        this.random = random;
    }

}
