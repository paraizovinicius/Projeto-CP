package Main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import levels.LoadSave;

public class UI {
    
    GamePanel gp;
    private Graphics2D g2;

    public UI(GamePanel gp){
        this.gp = gp;
    }

    public void update(){
        if(gp.gameState == gp.NORMAL_STATE && gp.mouse.CoordX >=30 && gp.mouse.CoordX <= 30+911/11 && gp.mouse.CoordY >= 703 && gp.mouse.CoordY <= 703+911/11 && gp.mouse.isClicked){
            gp.gameState = gp.MAP_STATE;
            gp.mouse.isClicked = false;
        }
        if(gp.gameState == gp.MAP_STATE && gp.mouse.CoordX >= 1135 && gp.mouse.CoordX <= 1171 && gp.mouse.CoordY >= 88 && gp.mouse.CoordY <= 128 && gp.mouse.isClicked){
            gp.gameState = gp.NORMAL_STATE;
            gp.mouse.isClicked = false;
        }
    }

    public void draw(Graphics2D g2d){
        this.g2 = g2d;

        if(gp.gameState == gp.NORMAL_STATE){
            drawIcons();
        }

        // MAP STATE -- 1
        if(gp.gameState == gp.MAP_STATE){
            drawMapState();
        }
    }

    public void drawIcons(){
        BufferedImage map_icon = LoadSave.getIcon(1);
        BufferedImage openMap_icon = LoadSave.getIcon(2);

        if(gp.mouseMotion.coordXmouseMotion >=35 && gp.mouseMotion.coordXmouseMotion <= 35+577/10 && gp.mouseMotion.coordYmouseMotion >= 708 && gp.mouseMotion.coordYmouseMotion <= 708+700/10){
            g2.drawImage(openMap_icon.getScaledInstance(911/11, 911/11, Image.SCALE_SMOOTH), 30, 703, null);
        } else{
            g2.drawImage(map_icon.getScaledInstance(577/10, 700/10, Image.SCALE_SMOOTH), 35, 708, null);
        }
        
    }

    public void drawMapState(){
        BufferedImage image = LoadSave.getIcon(3);
        int width = image.getWidth();
        int height = image.getHeight();
        g2.drawImage(image.getScaledInstance(3*width/4, 3*height/4, Image.SCALE_SMOOTH), (gp.SCREEN_WIDTH - 3*width/4)/2, (gp.SCREEN_HEIGHT - 3*height/4)/2, null);

    }

}


