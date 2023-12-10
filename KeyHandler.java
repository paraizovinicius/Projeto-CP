import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean acenar, dancar, sentar;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W) {
            acenar = true;
        }
        if(code == KeyEvent.VK_D) {
            System.out.println("DANÇAR  ");
        }
        if(code == KeyEvent.VK_DOWN) {
            System.out.println("SENTAR  ");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
