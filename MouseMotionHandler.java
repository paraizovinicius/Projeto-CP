import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionHandler implements MouseMotionListener {
    public int coordXmouseMotion;
    public int coordYmouseMotion;

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        coordXmouseMotion = e.getX();
        coordYmouseMotion = e.getY();
    }

}
