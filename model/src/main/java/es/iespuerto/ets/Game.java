package es.iespuerto.ets;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.Random;

/**
 * Me quede en el min = "13:42 / 20:28"
 */

/**
 * Runnable es solo una interfaz que necesita para instanciar un hilo para
 * contenerlo. Mientras que el hilo contiene ya la capacidad de generar un hilo.
 * Si usted
 * extiende el hilo usted no puede extender cualquier cosa (Java no admite la
 * herencia
 * múltiple). Puede tener múltiples interfaces en una clase, por lo tanto podría
 * tener
 * Runnable.
 */
public class Game extends Canvas implements Runnable {

    /**
     * version en serie generada
     */
    private static final long serialVersionUID = 3L;
    public static final int WIDTH = 640;
    public static final int HEIGHT = WIDTH / 12 * 9;

    /**
     * Hilo del proceso privado
     */
    private Thread thread;
    private boolean running = false;

    private Random r;
    private Handler handler;

    /**
     * Se crea una nueva instancia de la clase game, llamando al constructor.
     * se tiene que crear un objeto de la clase handler para luego luego en este
     * caso usarlo dentro de un metodo o si se crea fuera del mismo llamarlo en toda
     * la
     * clase
     */
    public Game() {
        handler = new Handler();
        // this.addKeyListener(new Keyinput());
        this.addKeyListener(new Keyinput(handler));

        new Window(WIDTH, HEIGHT, "Zombie Game", this);

        r = new Random();

        // for (int i = 0; i < 1; i++) {
        handler.addObject(new Player(r.nextInt(WIDTH / 2 - 32), r.nextInt(HEIGHT / 2 - 32), ID.Player));
        handler.addObject(new BasicEnemy(r.nextInt(WIDTH / 2 - 32), r.nextInt(HEIGHT / 2 - 32), ID.BasicEnemy));
    }

    /**
     * metodo de arranque de la aplicacion
     * que se sincroniza con un un objeto hilo
     * que hemos instanciado previamente
     */
    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    /**
     * metodo para matar la aplicacion que recoje una excepcion
     */
    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Game loop (Actualización de la física; se actualizan los datos del juego,
     * como por ejemplo la posición "x" e "y" para un caracter (posiciones de los
     * sprites, puntuación ...)
     * Dibujo; el dibujo de la imagen que se ve en la pantalla. Cuando este método
     * es llamado repetidamente produce la percepción de ser una película o una
     * animación.)
     */
    public void run() {
        long lastime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastime) / ns;
            lastime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            if (running)
                render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();
    }

    private void tick() {
        handler.tick();
    }

    /**
     * Metodo que hace que la ventana se renderice
     * el numero de fps que queramos y el uso de la memoria, ademas del color de
     * fondo de la pantalla.
     * Hay que importar la libreria "import javax.swing.JFrame;" para que funcione
     * BufferStrategy("La clase BufferStrategy representa el mecanismo con el que
     * organizar la memoria compleja en un Canvas o Window en particular . Las
     * limitaciones de hardware y software determinan si se puede implementar una
     * estrategia de búfer
     * particular y cómo. Estas limitaciones son detectables a través de las
     * capacidades de GraphicsConfiguration utilizadas al crear el Canvas o la
     * Window .")
     */
    private void render() {

        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(2);
            return;
        }
        java.awt.Graphics g = bs.getDrawGraphics();

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        handler.render(g);

        g.dispose();
        bs.show();
    }
}
