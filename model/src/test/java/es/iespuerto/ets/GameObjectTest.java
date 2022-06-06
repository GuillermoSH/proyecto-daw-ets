package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.awt.*;

public class GameObjectTest {
    GameObject objeto1;
    ID id;
    Handler handler;

    @BeforeEach
    public void beforeEach() {
        handler = new Handler();
        objeto1 = new GameObject(12,12,id){
            public void tick(){}
            public void render(Graphics g){}
        };
        objeto1.tick();
    }

    @Test
    public void getterXTest() {
        objeto1.setX(5);
        assertEquals(5, objeto1.getX());
    }

    @Test
    public void getterYTest() {
        objeto1.setY(4);
        assertEquals(4, objeto1.getY());
    }

    @Test
    public void getterIdTest() {
        assertNull(objeto1.getId());
    }

    @Test
    public void getterVelXTest() {
        objeto1.setvelX(4);
        assertEquals(4,objeto1.getvelX());
    }

    @Test
    public void getterVelYTest() {
        objeto1.setvelY(4);
        assertEquals(4,objeto1.getvelY());
    }
}
