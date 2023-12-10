import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {
    private int CoordX;
    private int CoordY;

    public Listener(int indexX, int indexY) {
        this.CoordX = indexX;
        this.CoordY = indexY;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
