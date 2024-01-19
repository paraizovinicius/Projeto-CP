package Tiles;
import java.awt.Rectangle;
import java.awt.Shape;

public class Tiles {
    public Rectangle tile;
    public boolean collision;

    public Tiles(int tipo) {
        if(tipo == 0 || tipo == 2){
            collision = false;
        }
        if(tipo == 1){
            collision = true;
        }
    }
}
