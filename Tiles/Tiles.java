package Tiles;
import java.awt.Rectangle;
import java.awt.Shape;

public class Tiles {
    public Rectangle tile;
    public boolean colision;

    public Tiles(int tipo) {
        if(tipo == 0){
            colision = true;
        }
        if(tipo == 1){
            colision = false;
        }
    }
}
