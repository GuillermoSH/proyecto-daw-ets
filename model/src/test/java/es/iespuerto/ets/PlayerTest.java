package es.iespuerto.ets;

import org.junit.jupiter.api.*;

public class PlayerTest {
    Player jugador;
    ID id;

    @BeforeEach
    public void beforeEach() {
        jugador = new Player(12,12,id);
    }

    @Test
    public void playerTickTest() {
        jugador.tick();
    }
}
