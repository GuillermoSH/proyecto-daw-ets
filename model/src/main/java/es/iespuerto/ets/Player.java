package es.iespuerto.ets;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * La clase Player amplia la clase GameObject e implementa los metodos tick() y render()
 * 
 * @author GuillermoSH
 */
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
     * Esta funcion se llama cada vez que se actualiza el juego y dibuja al jugador en la pantalla.
     * 
     * @param g Gráficos
     */
    @Override
    public void render(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, 32, 32);
    }

    /**
     * La funcion de tic se llama cada vez que se actualiza el juego, y mueve el objeto por la
     * velocidad en las direcciones x e y.
     */
    @Override
    public void tick() {
        x += velX;
        y += velY;

    }
}
