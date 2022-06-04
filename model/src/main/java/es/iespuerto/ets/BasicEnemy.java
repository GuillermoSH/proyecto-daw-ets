package es.iespuerto.ets;

import java.awt.*;
import java.util.Random;

/**
 * Clase con propiedades basicas de los enemigos basicos extiende de la clase
 * GameObject
 * 
 * @author Jonathan
 */
public class BasicEnemy extends GameObject {
    Random r = new Random();

    /**
     * Constructor de la clase usando los parametros de la clase de la que extiende
     * "GameObject"
     * 
     * @param x  vector x de posicion del objeto
     * @param y  vector y de posicion del objeto
     * @param id identificador del objeto
     */
    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);

        velX = 5;
        velY = 5;
    }

    /**
     * Esta funcion se llama cada vez que se actualiza el juego y dibuja un cuadrado rojo en las
     * coordenadas del jugador.
     * 
     * @param g Gráficos
     */
    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 16, 16);

    }

    /**
     * La funcion se llama tick() y anula la función tick() en la clase GameObject
     */
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
