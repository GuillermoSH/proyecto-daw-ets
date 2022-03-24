package es.iespuerto.ets;

import java.util.logging.Handler;

public class Keyinput {
    private Handler handler;
    private boolean keydown;
    
    public Keyinput(Handler handler, boolean keydown) {
        this.handler = handler;
        this.keydown = keydown;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public boolean isKeydown() {
        return keydown;
    }

    public void setKeydown(boolean keydown) {
        this.keydown = keydown;
    }

}
