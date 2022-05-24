package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class GameManagerTest {
    GameManager gManager = null;

    @BeforeEach
    public void before() {
        gManager = new GameManager(12);
    }

    @Test
    public void getSimpleGameManagerTest() {
        assertEquals(12, gManager.getSimpleGameManager());
    }   

    @Test
    public void setSimpleGameManager() {
        gManager.setSimpleGameManager(13);
        assertEquals(13, gManager.getSimpleGameManager());
    }
}
