package es.iespuerto.ets;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Clase con propiedades basicas de los enemigos basicos extiende de la clase
 * GameObject
 */
public class BasicEnemy extends GameObject {

    Random r = new Random();

    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);

        velX = 5;
        velY = 5;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 16, 16);

    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if (y <= 0 || y >= Game.HEIGHT - 32)
            velY *= -1;

        if (x <= 0 || x >= Game.WIDTH - 16)
            velX *= -1;
    }

}
