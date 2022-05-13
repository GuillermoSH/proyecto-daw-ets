import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Clase que crea una ventada donde se va a ejecutar la aplicacion
 */
public class Window extends Canvas {

    private static final long serialVersionUID = -2284879212465893870L;

    /**
     * Constructor publico para la ventana de la aplicacion, se define el tamaño
     * maximo minimo
     * y predefinido de la misma
     * 
     * @param width  ancho de la ventana
     * @param height altura de la ventana
     * @param title  nombre de la aplicacion
     */
    public Window(int width, int height, String title, Game game) {

        /**
         * Los frames a los que va a ir la ventana
         */
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        /**
         * "JFrame.EXIT_ON_CLOSE" finaliza el hilo que lleva las operaciones de la
         * aplicacion
         */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();
    }

}