package es.iespuerto.ets;

/**
 * Clase que almacena la información sobre el jugador dentro del juego
 * @param UserId id del jugador
 * @author Guillermo Sicilia Hernández
 * @version 0.1
 */
public class Player {
    public String UserId;

    public Player(String userId) {
        UserId = userId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
