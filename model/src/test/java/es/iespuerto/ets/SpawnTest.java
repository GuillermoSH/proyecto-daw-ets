package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class SpawnTest {
    Spawn spawnJugador1 = null;
    Handler handler = null;
    HUD hud = null;
    Random random = null;

    @BeforeEach
    public void beforeEach() {
        handler = new Handler();
        hud = new HUD(12,2,13,100);
        random = new Random();

        spawnJugador1 = new Spawn(handler, hud, random);
    }
    
    @Test
    public void getHandlerTest() {
        assertEquals(null, spawnJugador1.getHandler());
    }
/*
    @Test
    public void getHudTest() {
        assertEquals(hud, spawnJugador1.getHud());
    }
*/
    @Test
    public void getRandomTest() {
        assertEquals(null, spawnJugador1.getRandom());
    }
/*
    @Test
    public void setHandlerTest() {
        handler = new Handler();
        assertEquals(handler, spawnJugador1.getHandler());
    }
*/
    @Test
    public void setHudTest() {
        hud = new HUD(2,22,43,50);
        spawnJugador1.setHud(hud);
        assertEquals(hud, spawnJugador1.getHud());
    }

    @Test
    public void setRandomTest() {
        spawnJugador1.setRandom(random);
        assertEquals(random, spawnJugador1.getRandom());
    }
}
