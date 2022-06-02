package es.iespuerto.ets;

/**
 * Esta clase es el nucleo de la aplicacion. Se encarga del inicio, la
 * suspension y terminacion del videojuego
 * 
 * @author Jonathan
 */
public class GameManager {
    public int simpleGameManager;

    /**
     * Constructor para establecer el GameManager se introduce un id en forma de
     * int
     * 
     * @param simpleGameManager Propiedad de la clase
     */
    public GameManager(int simpleGameManager) {
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

    public int getSimpleGameManager() {
        return simpleGameManager;
    }

    public void setSimpleGameManager(int simpleGameManager) {
        this.simpleGameManager = simpleGameManager;
    }

}
