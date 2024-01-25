package levels;
import java.awt.image.BufferedImage;

import Entity.Player;
import Main.GamePanel;

import java.awt.Graphics;

public class LevelHandler {

    private static BufferedImage levelSprite;
    public static int currentLevel = 1;
    private static GamePanel gp;

    public LevelHandler(GamePanel gp) {
        this.gp = gp;
        setLevel(currentLevel); // inicializar no 1
    }

    public void checkLevel(Player player){

        // TOWN
        if (player.index_X> 1255 && player.index_Y<550 && getLevel() == 1) {
            setLevel(2); // Snowfort
            player.index_X= 709;
            player.index_Y = 450;
            player.velocity[0] = 0;
            player.velocity[1] = 0;

        }
        if (player.index_X< 215 && getLevel() == 1) {
            setLevel(7); // Dock
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (((player.index_X> 481 && player.index_X< 543) && (player.index_Y < 437)) && getLevel() == 1) {
            setLevel(13); // Coffee Shop
            player.index_X= 531;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (((player.index_X> 606 && player.index_X< 691) && (player.index_Y < 400)) && getLevel() == 1) {
            setLevel(12); // Night Club
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (((player.index_X> 955 && player.index_X< 1004) && (player.index_Y < 452)) && getLevel() == 1) {
            setLevel(16); // Gift Shop
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // SNOWFORT
        if (player.index_X< 200 && getLevel() == 2) {
            setLevel(1); // Downtown
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (player.index_X> 1327 && getLevel() == 2) {
            setLevel(3); // Plaza
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (((player.index_X> 402 && player.index_X< 604) && (player.index_Y < 350)) && getLevel() == 2) {
            setLevel(17); // Ice Rink
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // PLAZA
        if (player.index_X< 200 && getLevel() == 3) {
            setLevel(2); // Snowfort
            player.index_X= 709;
            player.index_Y = 450;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (player.index_X> 1367 && getLevel() == 3) {
            setLevel(4); // Forest
            player.index_X= 703;
            player.index_Y = 342;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (((player.index_X> 288 & player.index_X< 371) && (player.index_Y < 517)) && getLevel() == 3) {
            setLevel(19); // PetShop
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if ((((player.index_X> 653 && player.index_X< 739) || (player.index_X> 858 && player.index_X< 944)) && (player.index_Y < 448)) && getLevel() == 3) {
            setLevel(18); // Stage
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (((player.index_X> 1041 && player.index_X< 1152) && (player.index_Y < 470)) && getLevel() == 3) {
            setLevel(20); // Pizza Parlor
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // FOREST
        if (player.index_X> 1186 && player.index_Y > 648 && getLevel() == 4) {
            setLevel(5); // Cove
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (player.index_X> 1139 && player.index_Y < 312 && getLevel() == 4) {
            setLevel(6); // Mine Shack
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (player.index_X< 107 && player.index_Y < 293 && getLevel() == 4) {
            setLevel(3); // Plaza
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        // COVE
        if (player.index_Y < 325 && player.index_X > 371 && player.index_X < 566 && getLevel() == 5) {
            setLevel(4); // Forest
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // MINE SHACK
        if (player.index_Y > 735 && player.index_X<488 && getLevel() == 6) {
            setLevel(4); // Forest
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (((player.index_X> 696 && player.index_X< 779) && (player.index_Y < 485)) && getLevel() == 6) {
            setLevel(21); // Mine
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // DOCK
        if (player.index_X> 1200 && player.index_Y<363 && getLevel() == 7) {
            setLevel(1); // Downtown
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (player.index_X< 120 && getLevel() == 7) {
            setLevel(8); // Beach
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (player.index_X> 319 && player.index_X< 565 && player.index_Y < 296 && getLevel() == 7) {
            setLevel(9); // Ski Village
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // BEACH
        if (player.index_X> 1152 && player.index_Y < 426 && player.index_Y > 332 && getLevel() == 8) {
            setLevel(7); // Dock
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if ((player.index_X> 378 && player.index_X< 474 && player.index_Y < 381) && getLevel() == 8) {
            setLevel(14); // Lighthouse
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // SKI VILLAGE

        if (player.index_X> 227 && player.index_X< 514 && player.index_Y > 732 && getLevel() == 9) {
            setLevel(7); // Dock
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if (player.index_X< 385 && player.index_Y < 538 && getLevel() == 9) {
            setLevel(10); // Ski Hill
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if ((player.index_X> 990 && player.index_X< 1044 && player.index_Y < 350) && getLevel() == 9) {
            setLevel(11); // Ski Lodge
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // SKI HILL
        if (((player.index_X> 835 && player.index_Y < 267) || (player.index_X> 762 && player.index_Y < 248))&& getLevel() == 10) {
            setLevel(9); // Ski Village
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // SKI LODGE
        if ((player.index_Y > 539 && player.index_Y < 647 && player.index_X< 190) && getLevel() == 11) {
            setLevel(9); // Ski Village
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // NIGHT CLUB - 12
        if (((player.index_Y > 460 && player.index_Y < 564) && (player.index_X< 210)) && getLevel() == 12) {
            setLevel(1); // Downtown
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // COFFEE SHOP - 13
        if (((player.index_X> 698 && player.index_X< 764) && (player.index_Y < 370)) && getLevel() == 13) {
            setLevel(1); // Downtown
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // LIGHTHOUSE - 14
        if ((player.index_X> 368 && player.index_X< 483 && player.index_Y > 420) && getLevel() == 14) {
            setLevel(8); // Beach
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        if((player.index_X < 300 && player.index_Y<300 && getLevel()==14)){
            setLevel(15); // Beacon
            player.index_X= 392;
            player.index_Y = 686;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        // BEACON - 15
        if(player.index_X > 91 && player.index_X<232 && player.index_Y>540 && player.index_Y<665 && getLevel()==15){
            setLevel(14); // Lighthouse
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }


        // GIFT SHOP - 16
        if (((player.index_X> 960 && player.index_X< 1110) && (player.index_Y < 448)) && getLevel() == 16) {
            setLevel(1); // Downtown
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        
        // ICE RINK - 17
        if (((player.index_X> 693 && player.index_X< 766) && (player.index_Y < 190)) && getLevel() == 17) {
            setLevel(2); // Snowfort
            player.index_X= 709;
            player.index_Y = 450;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // STAGE - 18
        if (((player.index_X< 179) && (player.index_Y > 601 && player.index_Y < 676)) && getLevel() == 18) {
            setLevel(3); // Plaza
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // PET SHOP - 19
        if (((player.index_X> 608 & player.index_X< 939) && (player.index_Y < 384)) && getLevel() == 19) {
            setLevel(3); // Plaza
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }
        
        // PIZZA PARLOR - 20
        if (((player.index_X> 680 && player.index_X< 894) && player.index_Y < 427) && getLevel() == 20) {
            setLevel(3); // Plaza
            player.index_X= 785;
            player.index_Y = 580;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

        // MINE
        if (((player.index_X< 208 && player.index_Y > 351 && player.index_Y < 523)) && getLevel() == 21) {
            setLevel(6); // Mine Shack
            player.index_X= 709;
            player.index_Y = 560;
            player.velocity[0] = 0;
            player.velocity[1] = 0;
        }

    }

    public static void setLevel(int level) {
        if(level == 1){
            levelSprite = LoadSave.getBg(1); // Town
            currentLevel = 1;
            gp.stopMusic();
        } else if(level == 2){
            levelSprite = LoadSave.getBg(2); // Snow fort
            currentLevel = 2;
            gp.stopMusic();
        } else if(level == 3){
            levelSprite = LoadSave.getBg(3); // Plaza
            currentLevel = 3;
            gp.stopMusic();
        } else if(level == 4){
            levelSprite = LoadSave.getBg(4); // forest
            currentLevel = 4;
            gp.stopMusic();
        } else if(level == 5){
            levelSprite = LoadSave.getBg(5); // Cove
            currentLevel = 5;
            gp.stopMusic();
        } else if(level == 6){
            levelSprite = LoadSave.getBg(6); // Mineschack
            currentLevel = 6;
            gp.stopMusic();
        } else if(level == 7){
            levelSprite = LoadSave.getBg(7); // DOCK
            currentLevel = 7;
            gp.stopMusic();
        } else if(level == 8){
            levelSprite = LoadSave.getBg(8); // Beach
            currentLevel = 8;
            gp.stopMusic();
        } else if(level == 9){
            levelSprite = LoadSave.getBg(9); // Ski Village
            currentLevel = 9;
            gp.stopMusic();
        } else if(level == 10){
            levelSprite = LoadSave.getBg(10); // Ski hill
            currentLevel = 10;
            gp.stopMusic();
        } else if(level == 11){
            levelSprite = LoadSave.getBg(11); // Ski lodge
            currentLevel = 11;
            gp.stopMusic();
        } else if(level == 12){
            levelSprite = LoadSave.getBg(12); // night club 1 
            currentLevel = 12;
            gp.playMusic(1);
        } else if(level == 13){
            levelSprite = LoadSave.getBg(13); // coffe shop
            currentLevel = 13;
            gp.playMusic(0);
        } else if(level == 14){
            levelSprite = LoadSave.getBg(14); // lighthouse
            currentLevel = 14;
            gp.stopMusic();
        } else if(level == 15){
            levelSprite = LoadSave.getBg(15); // beacon
            currentLevel = 15;
            gp.stopMusic();
        } else if(level == 16){
            levelSprite = LoadSave.getBg(16); // gift shop
            currentLevel = 16;
            gp.playMusic(3);
        } else if(level == 17){
            levelSprite = LoadSave.getBg(17); // ice rink
            currentLevel = 17;
            gp.stopMusic();
        } else if(level == 18){
            levelSprite = LoadSave.getBg(18); // stage
            currentLevel = 18;
            gp.stopMusic();
        } else if(level == 19){
            levelSprite = LoadSave.getBg(19); // pet shop
            currentLevel = 19;
            gp.stopMusic();
        } else if(level == 20){
            levelSprite = LoadSave.getBg(20); // pizza parlor
            currentLevel = 20;
            gp.playMusic(2);
        } else if(level == 21){
            levelSprite = LoadSave.getBg(21); // Mine
            currentLevel = 21;
            gp.stopMusic();
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
