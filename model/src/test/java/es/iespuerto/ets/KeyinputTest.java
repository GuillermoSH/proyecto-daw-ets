package es.iespuerto.ets;

import org.junit.jupiter.api.*;
import java.awt.event.*;
import java.awt.*;


public class KeyinputTest {
    Handler handler;
    Keyinput key;
    KeyEvent e;
    Button a;
    Graphics g;
    ID id;

    @BeforeEach
    public void beforeEach() {
        a = new Button();
        key = new Keyinput(handler);
        e = new KeyEvent(a, 1, 20, 1, 10, 'a');
        handler = new Handler();
        GameObject object = new GameObject(12,12,id) {
            public void tick(){}
            public void render(Graphics g){}
        };
        handler.addObject(object);
    }
}
