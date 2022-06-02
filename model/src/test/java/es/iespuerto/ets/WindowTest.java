package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WindowTest {
    Window ventana1 = null;
    Game game = null;

    @BeforeEach
    public void beforeEach() {
        game = new Game();
        ventana1 = new Window(25,25,"ZombieGames",game);
    }

    @Test
    public void obtenerNumeroSerie() {
        assertEquals(-2284879212465893870L,Window.serialVersionUID);
    }
}
