package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class HandlerTest {
    Handler handler = null;
    GameObject objeto = null;
    ID id;

    @BeforeEach
    public void before() {
        handler = new Handler();
    }

    @Test
    public void addObjectCorrectTest() {
        assertTrue(handler.addObject(objeto));
    }

    @Test
    public void removeObjectTest() {
        handler.addObject(objeto);
        assertTrue(handler.removeObject(objeto));
    }

    @Test
    public void getObjects() {
        handler.addObject(objeto);
        List<GameObject> lista = new LinkedList<>(Arrays.asList(objeto));
        assertEquals(lista,handler.getObjects());
    }
}
