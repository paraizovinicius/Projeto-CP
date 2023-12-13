import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {
    private int CoordX;
    private int CoordY;
    private boolean mouse = false;

    public Listener(int indexX, int indexY, boolean mouse) {
        this.CoordX = indexX; // coordenadas do mouse
        this.CoordY = indexY; // coordeandas do mouse
        this.mouse = mouse; // boolean para verificar se mouse foi clicado
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(mouse == true){
            System.out.println("Mouse clicado");
        }

    }
    
}
