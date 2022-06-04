package es.iespuerto.ets;

import org.junit.jupiter.api.*;

public class BasicEnemyTest {
    BasicEnemy enemigo;
    ID id;

    @BeforeEach
    public void beforeEach() {
        enemigo = new BasicEnemy(-1, -1, id);
    }

    @Test
    public void basicEnemyTickTest() {
        enemigo.tick();
    }
}
