package es.iespuerto.ets;

/**
 * Esta clase es el nucleo de la aplicacion. Se encarga del inicio, la
 * suspension y terminacion del videojuego
 * 
 * @author Jonathan
 * @param simpleGameManager referencia del game manager
 */
public class GameManager {
    private int simpleGameManager;

    /**
     * Constructor para establecer el GameManager se introduce un id en forma de
     * byte
     * 
     * @param simpleGameManager propiedad de la clase
     */
    public GameManager(int simpleGameManager) {
        this.simpleGameManager = simpleGameManager;
    }

    /**
     * Metodo para inciar la aplicacion
     */
    public void Start() {

    }

    /**
     * Metodo para cargar la sesion
     */
    public void LoadLevel() {

    }

    /**
     * Metodo que arranca el juego
     */
    public void StartGame() {

    }

    /**
     * Metodo para salir de la aplicacion
     */
    public void Quit() {

    }

    public int getSimpleGameManager() {
        return this.simpleGameManager;
    }

    public void setSimpleGameManager(int simpleGameManager) {
        this.simpleGameManager = simpleGameManager;
    }

}
