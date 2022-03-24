package es.iespuerto.ets;

/**
 * Esta clase es el nucleo de la aplicacion. Se encarga del inicio, la
 * suspension y terminacion del videojuego
 * 
 * @author Jonathan
 * @param simpleGameManager referencia del game manager
 */
public class GameManager {
    public byte simpleGameManager;

    /**
     * Constructor para establecer el GameManager se introduce un id en forma de
     * byte
     * 
     * @param simpleGameManager Propiedad de la clase
     */
    public GameManager(byte simpleGameManager) {
        this.simpleGameManager = simpleGameManager;
    }

    /**
     * metodo para inciar la aplicacion
     */
    public void Start() {

    }

    /**
     * metodo para cargar la sesion
     */
    public void LoadLevel() {

    }

    /**
     * metodo que arranca el juego
     */
    public void StartGame() {

    }

    /**
     * metodo para salir de la aplicacion
     */
    public void Quit() {

    }

    public byte getSimpleGameManager() {
        return simpleGameManager;
    }

    public void setSimpleGameManager(byte simpleGameManager) {
        this.simpleGameManager = simpleGameManager;
    }

}
