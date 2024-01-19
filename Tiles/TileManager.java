package Tiles;
import java.awt.Color;
import java.awt.Graphics2D;

import Main.GamePanel;

public class TileManager {
    private GamePanel gp;
    private Tiles solidTile;
    private Tiles emptyTile;
    int mapTileNum[] []; // Array que guarda o número de cada tile do mapa
    
    public TileManager(GamePanel gp){
        this.gp = gp;
        this.solidTile = new Tiles(0); // Tipo de tile que collision = true
        this.emptyTile = new Tiles(1); // Tipo de tile que collision = false mas o player não aparece na tela
        this.mapTileNum = new int[gp.tileRow] [gp.tileCol];
    }

    public void loadMap(){
        
    }

    public void draw(Graphics2D g2) {
        int col = 0;
        int row = 0;
        int x = 0;
        int y = 0;
        g2.setColor(Color.red);

        while(col < gp.tileCol && row < gp.tileRow){
            g2.drawRect(x, y, gp.tileSize, gp.tileSize);
            col++;
            x += gp.tileSize;
            if(col == gp.tileCol){
                col = 0;
                row++;
                y += gp.tileSize;
                x = 0;
            }
        }
        

    }
}
