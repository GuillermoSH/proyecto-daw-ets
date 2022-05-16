package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class HUDTest {
    HUD hud = null;

    @BeforeEach
    public void before() {
        hud = new HUD(12, 2, 13, 100);
    }

    @Test
    public void getScoreTest() {
        assertEquals(12, hud.getScore());
    }

    @Test
    public void setScoreTest() {
        hud.setScore(11);
        assertEquals(11, hud.getScore());
    }

    @Test
    public void getLevelTest() {
        assertEquals(2, hud.getLevel());
    }

    @Test
    public void setLevelTest() {
        hud.setLevel(4);
        assertEquals(4, hud.getLevel());
    }

    @Test
    public void getGreenValueTest() {
        assertEquals(13, hud.getGreenValue());
    }
    
    @Test
    public void setGreenValueTest() {
        hud.setGreenValue(15);
        assertEquals(15, hud.getGreenValue());
    }

    @Test
    public void getHealthTest() {
        assertEquals(100, hud.getHealth());
    }
    
    @Test
    public void setHealthTest() {
        hud.setHealth(150);
        assertEquals(150, hud.getHealth());
    }

}
