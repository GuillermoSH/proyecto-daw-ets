package es.iespuerto.ets;

import java.util.logging.Handler;

public class Spawn {
    private Handler handler;
    private HUD hud;
    private Random Random;

    public Spawn(Handler handler, HUD hud, Random random) {
        this.handler = handler;
        this.hud = hud;
        Random = random;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public HUD getHud() {
        return hud;
    }

    public void setHud(HUD hud) {
        this.hud = hud;
    }

    public Random getRandom() {
        return Random;
    }

    public void setRandom(Random random) {
        Random = random;
    }
    
}
