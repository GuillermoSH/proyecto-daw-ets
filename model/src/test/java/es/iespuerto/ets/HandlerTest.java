package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class HandlerTest {
    Handler handler = null;
    GameObject objeto = null;

    @BeforeEach
    public void before() {
        handler = new Handler();
    }

    @Test
    public void addObjectTest() {
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
        List<GameObject> lista = new LinkedList<>(Arrays.asList(null,null));
        assertEquals(lista,handler.getObjects());
    }
}
