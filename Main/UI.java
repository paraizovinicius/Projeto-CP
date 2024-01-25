package Main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import levels.LevelHandler;
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
        if(gp.gameState == gp.MAP_STATE){
            if(gp.mouse.CoordX >= 1135 && gp.mouse.CoordX <= 1171 && gp.mouse.CoordY >= 88 && gp.mouse.CoordY <= 128 && gp.mouse.isClicked){
                gp.gameState = gp.NORMAL_STATE;
                gp.mouse.isClicked = false;
            } else{
                if(gp.mouse.CoordX >= 728 && gp.mouse.CoordX <= 815 && gp.mouse.CoordY >= 414 && gp.mouse.CoordY <= 499 && gp.mouse.isClicked){
                    LevelHandler.setLevel(2); // Snowfort
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 852 && gp.mouse.CoordX <= 1049 && gp.mouse.CoordY >= 404 && gp.mouse.CoordY <= 490 && gp.mouse.isClicked){
                    LevelHandler.setLevel(3); // Plaza
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 663 && gp.mouse.CoordX <= 828 && gp.mouse.CoordY >= 290 && gp.mouse.CoordY <= 374 && gp.mouse.isClicked){
                    LevelHandler.setLevel(17); // Ice Rink
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 899 && gp.mouse.CoordX <= 1055 && gp.mouse.CoordY >= 312 && gp.mouse.CoordY <= 368 && gp.mouse.isClicked){
                    LevelHandler.setLevel(4); // Forest
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 963 && gp.mouse.CoordX <= 1053 && gp.mouse.CoordY >= 245 && gp.mouse.CoordY <= 296 && gp.mouse.isClicked){
                    LevelHandler.setLevel(5); // Cove
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 728 && gp.mouse.CoordX <= 815 && gp.mouse.CoordY >= 414 && gp.mouse.CoordY <= 499 && gp.mouse.isClicked){
                    LevelHandler.setLevel(2); // Snowfort
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 820 && gp.mouse.CoordX <= 903 && gp.mouse.CoordY >= 196 && gp.mouse.CoordY <= 259 && gp.mouse.isClicked){
                    LevelHandler.setLevel(6); // Mine Shack
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 460 && gp.mouse.CoordX <= 599 && gp.mouse.CoordY >= 235 && gp.mouse.CoordY <= 304 && gp.mouse.isClicked){
                    LevelHandler.setLevel(9); // Ski Village
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 420 && gp.mouse.CoordX <= 575 && gp.mouse.CoordY >= 147 && gp.mouse.CoordY <= 217 && gp.mouse.isClicked){
                    LevelHandler.setLevel(10); // Ski hill
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 267 && gp.mouse.CoordX <= 395 && gp.mouse.CoordY >= 272 && gp.mouse.CoordY <= 396 && gp.mouse.isClicked){
                    LevelHandler.setLevel(8); // Beach
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 259 && gp.mouse.CoordX <= 424 && gp.mouse.CoordY >= 474 && gp.mouse.CoordY <= 572 && gp.mouse.isClicked){
                    LevelHandler.setLevel(7); // Dock
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
                if(gp.mouse.CoordX >= 463 && gp.mouse.CoordX <= 687 && gp.mouse.CoordY >= 400 && gp.mouse.CoordY <= 495 && gp.mouse.isClicked){
                    LevelHandler.setLevel(1); // TOWN
                    gp.gameState = gp.NORMAL_STATE;
                    gp.mouse.isClicked = false;
                }
            }
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


