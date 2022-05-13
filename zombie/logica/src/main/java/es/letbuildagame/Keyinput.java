import java.awt.KeyEvent;
import java.awt.KeyAdapter;



public class Keyinput extends KeyAdapter{

    public void keyPressed(KeyEvent e) {

        int Key = e.getKeyCode(); 

        System.out.println(Key); 
    }

    public void KeyReleased (KeyEvent e) {

    }
}