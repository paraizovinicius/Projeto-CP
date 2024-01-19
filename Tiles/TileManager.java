package Tiles;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import Main.GamePanel;
import levels.LevelHandler;

public class TileManager {
    private GamePanel gp;
    public Tiles[] tile = new Tiles[3];
    public int mapTileNum[][]; // Array que guarda o número de cada tile do mapa

    public TileManager(GamePanel gp) {
        this.gp = gp;
        this.tile[0] = new Tiles(0); // Tipo de tile que collision = false e o player aparece na tela
        this.tile[1] = new Tiles(1); // Tipo de tile que collision = true
        this.tile[2] = new Tiles(2); // Tipo de tile que collision = false mas o player não aparece na tela
        this.mapTileNum = new int[gp.tileRow][gp.tileCol];
    }

    public void loadMap() {
        try {
            InputStream is = getClass().getResourceAsStream("/res/maps/"+LevelHandler.getLevel()+".txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            int col = 0;
            int row = 0;

            while (col < gp.tileCol && row < gp.tileRow) {

                String line = br.readLine();

                while (col < gp.tileCol) {
                    String numbers[] = line.split(" "); // vamos dividir todos os numeros de line e guardar em um array
                                                        // de Strings
                    int num = Integer.parseInt(numbers[col]); // vamos pegar o numero da coluna atual e transformar em
                                                              // um int
                    mapTileNum[row][col] = num; // vamos guardar o numero na posição do array mapTileNum
                    col++;
                }
                if (col == gp.tileCol) {
                    col = 0;
                    row++;
                }
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {
        int col = 0;
        int row = 0;
        int x = 0;
        int y = 0;

        while (col < gp.tileCol && row < gp.tileRow) {
            int tileNum = mapTileNum[row][col];

            if (tileNum == 0) {
                g2.setColor(Color.red);
            }else{g2.setColor(Color.white);}

            g2.drawRect(x, y, gp.tileSize, gp.tileSize);
            col++;
            x += gp.tileSize;
            if (col == gp.tileCol) {
                col = 0;
                row++;
                y += gp.tileSize;
                x = 0;
            }
        }

    }

    public void update() {
        loadMap();
    }
}
