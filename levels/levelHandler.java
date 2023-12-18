package levels;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

import Main.GamePanel;
import Main.LoadSave;

public class levelHandler {

    private GamePanel gamepanel;
    private BufferedImage levelSprite;

    public levelHandler(GamePanel gamepanel) {
        this.gamepanel = gamepanel;
        this.levelSprite = LoadSave.getImage(57);
    }

    public void draw(Graphics g){
        g.drawImage(levelSprite, 0, 0, null);
    }

    public void update(){

    }
    
}
