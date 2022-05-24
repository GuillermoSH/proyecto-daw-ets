package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    Game game = null;

    @BeforeEach
    public void beforeEach() {
        game = new Game();
    }
}
