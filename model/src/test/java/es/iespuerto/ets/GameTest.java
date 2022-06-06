package es.iespuerto.ets;

import org.junit.jupiter.api.*;

public class GameTest {
    Game game = null;

    @BeforeEach
    public void beforeEach() {
        game = new Game();
    }

    @Test
    public void runTest() {
        game.start();
    }
}
