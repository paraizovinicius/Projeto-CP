import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {
    public int CoordX;
    public int CoordY;
    public boolean isClicked = false;

    @Override
    public void mouseClicked(MouseEvent e) {
        isClicked = true;
        CoordX = e.getX();
        CoordY = e.getY();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
