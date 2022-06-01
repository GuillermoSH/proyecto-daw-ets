package es.iespuerto.ets;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject {

    Random r = new Random();

    /**
     * Constructor de clase abtracta Player que
     * a su vez hereda las propiedades y metodos de GameObject.
     * 
     * @param x
     * @param y
     * @param id
     */
    public Player(int x, int y, ID id) {
        super(x, y, id);

    }

    /**
     * 
     */
    @Override
    public void render(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, 32, 32);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

    }
}
