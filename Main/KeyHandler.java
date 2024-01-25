package Main;
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
            System.out.println("ACENAR  ");
        }
        if(code == KeyEvent.VK_D) {
            dancar = true;
            System.out.println("DANÇAR  ");
        }
        if(code == KeyEvent.VK_DOWN) {
            sentar = true;
            System.out.println("SENTAR  ");
        }
        if(code == KeyEvent.VK_M) {
            mapState(code);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void mapState(int code){
        
    }

}
