package levels;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class LevelHandler {

    private static BufferedImage levelSprite;
    public static int currentLevel = 1;

    public LevelHandler() {
        setLevel(currentLevel);
    }

    public static void setLevel(int level) {
        if(level == 1){
            levelSprite = LoadSave.getBg(1); // Town
            currentLevel = 1;
        } else if(level == 2){
            levelSprite = LoadSave.getBg(2); // Snow fort
            currentLevel = 2;
        } else if(level == 3){
            levelSprite = LoadSave.getBg(3); // Plaza
            currentLevel = 3;
        } else if(level == 4){
            levelSprite = LoadSave.getBg(4); // forest
            currentLevel = 4;
        } else if(level == 5){
            levelSprite = LoadSave.getBg(5); // Cove
            currentLevel = 5;
        } else if(level == 6){
            levelSprite = LoadSave.getBg(6); // Mineschack
            currentLevel = 6;
        } else if(level == 7){
            levelSprite = LoadSave.getBg(7); // DOCK
            currentLevel = 7;
        } else if(level == 8){
            levelSprite = LoadSave.getBg(8); // Beach
            currentLevel = 8;
        } else if(level == 9){
            levelSprite = LoadSave.getBg(9); // Ski Village
            currentLevel = 9;
        } else if(level == 10){
            levelSprite = LoadSave.getBg(10); // Ski hill
            currentLevel = 10;
        } else if(level == 11){
            levelSprite = LoadSave.getBg(11); // Ski lodge
            currentLevel = 11;
        } else if(level == 12){
            levelSprite = LoadSave.getBg(12); // night club 1 
            currentLevel = 12;
        } else if(level == 13){
            levelSprite = LoadSave.getBg(13); // coffe shop
            currentLevel = 13;
        } else if(level == 14){
            levelSprite = LoadSave.getBg(14); // lighthouse
            currentLevel = 14;
        } else if(level == 15){
            levelSprite = LoadSave.getBg(15); // beacon
            currentLevel = 15;
        } else if(level == 16){
            levelSprite = LoadSave.getBg(16); // gift shop
            currentLevel = 16;
        } else if(level == 17){
            levelSprite = LoadSave.getBg(17); // ice rink
            currentLevel = 17;
        } else if(level == 18){
            levelSprite = LoadSave.getBg(18); // stage
            currentLevel = 18;
        } else if(level == 19){
            levelSprite = LoadSave.getBg(19); // pet shop
            currentLevel = 19;
        } else if(level == 20){
            levelSprite = LoadSave.getBg(20); // pizza parlor
            currentLevel = 20;
        } else if(level == 21){
            levelSprite = LoadSave.getBg(21); // Mine
            currentLevel = 21;
        }
    }
    public static int getLevel(){
        return currentLevel;
    }

    public void draw(Graphics g){
        g.drawImage(levelSprite, 0, 0, null);
    }

    public void update(){
    }
    
}
