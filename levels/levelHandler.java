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
            levelSprite = LoadSave.getBg(57); // Town
            currentLevel = 1;
        } else if(level == 2){
            levelSprite = LoadSave.getBg(58); // Snow fort
            currentLevel = 2;
        } else if(level == 3){
            levelSprite = LoadSave.getBg(59); // Plaza
            currentLevel = 3;
        } else if(level == 4){
            levelSprite = LoadSave.getBg(60); // forest
            currentLevel = 4;
        } else if(level == 5){
            levelSprite = LoadSave.getBg(61); // Cove
            currentLevel = 5;
        } else if(level == 6){
            levelSprite = LoadSave.getBg(62); // Mineschack
            currentLevel = 6;
        } else if(level == 7){
            levelSprite = LoadSave.getBg(63); // DOCK
            currentLevel = 7;
        } else if(level == 8){
            levelSprite = LoadSave.getBg(64); // Beach
            currentLevel = 8;
        } else if(level == 9){
            levelSprite = LoadSave.getBg(65); // Ski Village
            currentLevel = 9;
        } else if(level == 10){
            levelSprite = LoadSave.getBg(66); // Ski hill
            currentLevel = 10;
        } else if(level == 11){
            levelSprite = LoadSave.getBg(67); // Ski lodge
            currentLevel = 11;
        } else if(level == 12){
            levelSprite = LoadSave.getBg(68); // night club 1 
            currentLevel = 12;
        } else if(level == 13){
            levelSprite = LoadSave.getBg(69); // coffe shop
            currentLevel = 13;
        } else if(level == 14){
            levelSprite = LoadSave.getBg(70); // lighthouse
            currentLevel = 14;
        } else if(level == 15){
            levelSprite = LoadSave.getBg(71); // beacon
            currentLevel = 15;
        } else if(level == 16){
            levelSprite = LoadSave.getBg(72); // gift shop
            currentLevel = 16;
        } else if(level == 17){
            levelSprite = LoadSave.getBg(73); // ice rink
            currentLevel = 17;
        } else if(level == 18){
            levelSprite = LoadSave.getBg(74); // stage
            currentLevel = 18;
        } else if(level == 19){
            levelSprite = LoadSave.getBg(75); // pet shop
            currentLevel = 19;
        } else if(level == 20){
            levelSprite = LoadSave.getBg(76); // pizza parlor
            currentLevel = 20;
        } else if(level == 21){
            levelSprite = LoadSave.getBg(77); // Mine
            currentLevel = 21;
        } else if(level == 22){
            levelSprite = LoadSave.getBg(78); //  ...
            currentLevel = 22;
        } else if(level == 23){
            levelSprite = LoadSave.getBg(79);
            currentLevel = 23;
        } else if(level == 24){
            levelSprite = LoadSave.getBg(80);
            currentLevel = 24;
        } else if(level == 25){
            levelSprite = LoadSave.getBg(81);
            currentLevel = 25;
        } else if(level == 26){
            levelSprite = LoadSave.getBg(82);
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
