package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EnemyTest {
    Enemy enemigo1 = null;

    @BeforeEach
    public void beforeEach() {
        enemigo1 = new Enemy("red", "hard", 5);
    }

    @Test
    public void getColorTest() {
        assertEquals("red", enemigo1.getColor());
    }

    @Test
    public void setColorTest() {
        enemigo1.setColor("blue");
        assertEquals("blue", enemigo1.getColor());
    }

    @Test
    public void getDifficultyTest() {
        assertEquals("hard", enemigo1.getDifficulty());
    }

    @Test
    public void setDifficultyTest() {
        enemigo1.setDifficulty("normal");
        assertEquals("normal", enemigo1.getDifficulty());
    }

    @Test
    public void getAmountTest() {
        assertEquals(5, enemigo1.getAmount());
    }

    @Test
    public void setAmountTest() {
        enemigo1.setAmount(1);
        assertEquals(1, enemigo1.getAmount());
    }
}
