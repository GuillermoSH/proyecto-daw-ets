package es.iespuerto.ets;

import java.awt.*;
import java.util.Random;

/**
 * Clase para la generacion de la entidad Player, que sera la forma en la que el
 * jugador podra interactuar con el juego
 * 
 * @author GuillermoSH
 */
public class Player extends GameObject {

    Random r = new Random();

    /**
     * Constructor de clase Player que a su vez hereda las propiedades y metodos de
     * la clase abstracta GameObject.
     * 
     * @param x
     * @param y
     * @param id
     */
    public Player(int x, int y, ID id) {
        super(x, y, id);
    }

    /**
     * Metodo sobrecargado del metodo render de la clase GameObject de la cual
     * hereda esta clase. Este hace que la ventana se renderice el numero de fps que
     * queramos y el uso de la memoria, ademas del color de fondo de la pantalla.
     * Hay que importar la libreria "import javax.swing.JFrame;" para que funcione
     * BufferStrategy("La clase BufferStrategy representa el mecanismo con el que
     * organizar la memoria compleja en un Canvas o Window en particular . Las
     * limitaciones de hardware y software determinan si se puede implementar una
     * estrategia de búfer particular y cómo. Estas limitaciones son detectables a
     * través de las capacidades de GraphicsConfiguration utilizadas al crear el
     * Canvas o la Window .")
     */
    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 32, 32);
    }

    /**
     * Metodo sobrecargado del metodo render de la clase GameObject de la cual
     * hereda esta clase
     */
    @Override
    public void tick() {
        x += velX;
        y += velY;
    }
}
