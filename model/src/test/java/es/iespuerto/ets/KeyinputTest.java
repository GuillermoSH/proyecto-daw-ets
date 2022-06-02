package es.iespuerto.ets;

import org.junit.jupiter.api.*;
import java.awt.event.*;

public class KeyinputTest {
    Handler handler;
    Keyinput key;
    KeyEvent e;

    @BeforeEach
    public void beforeEach() {
        key = new Keyinput(handler);
    }
}
