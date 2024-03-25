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
        LevelHandler.gp = gp;
        setLevel(currentLevel); // inicializar no 1
    }

    public void checkLevel(Player player){

        // TOWN
        if (player.index_X> 1255 && player.index_Y<550 && getLevel() == 1) {
            setLevel(2); // Snowfort
        }
        if (player.index_X< 215 && getLevel() == 1) {
            setLevel(7); // Dock
        }
        if (((player.index_X> 481 && player.index_X< 543) && (player.index_Y < 437)) && getLevel() == 1) {
            setLevel(13); // Coffee Shop

        }
        if (((player.index_X> 606 && player.index_X< 691) && (player.index_Y < 400)) && getLevel() == 1) {
            setLevel(12); // Night Club
        }
        if (((player.index_X> 955 && player.index_X< 1004) && (player.index_Y < 452)) && getLevel() == 1) {
            setLevel(16); // Gift Shop
        }

        // SNOWFORT
        if (player.index_X< 200 && getLevel() == 2) {
            setLevel(1); // Downtown
        }
        if (player.index_X> 1327 && getLevel() == 2) {
            setLevel(3); // Plaza
        }
        if (((player.index_X> 402 && player.index_X< 604) && (player.index_Y < 350)) && getLevel() == 2) {
            setLevel(17); // Ice Rink
        }

        // PLAZA
        if (player.index_X< 200 && getLevel() == 3) {
            setLevel(2); // Snowfort
        }
        if (player.index_X> 1367 && getLevel() == 3) {
            setLevel(4); // Forest
        }
        if (((player.index_X> 288 & player.index_X< 371) && (player.index_Y < 517)) && getLevel() == 3) {
            setLevel(19); // PetShop
        }
        if ((((player.index_X> 653 && player.index_X< 739) || (player.index_X> 858 && player.index_X< 944)) && (player.index_Y < 448)) && getLevel() == 3) {
            setLevel(18); // Stage
        }
        if (((player.index_X> 1041 && player.index_X< 1152) && (player.index_Y < 470)) && getLevel() == 3) {
            setLevel(20); // Pizza Parlor
        }

        // FOREST
        if (player.index_X> 1186 && player.index_Y > 648 && getLevel() == 4) {
            setLevel(5); // Cove
        }
        if (player.index_X> 1139 && player.index_Y < 312 && getLevel() == 4) {
            setLevel(6); // Mine Shack
        }
        if (player.index_X< 107 && player.index_Y < 293 && getLevel() == 4) {
            setLevel(3); // Plaza
        }
        // COVE
        if (player.index_Y < 325 && player.index_X > 371 && player.index_X < 566 && getLevel() == 5) {
            setLevel(4); // Forest
        }

        // MINE SHACK
        if (player.index_Y > 735 && player.index_X<488 && getLevel() == 6) {
            setLevel(4); // Forest
        }
        if (((player.index_X> 696 && player.index_X< 779) && (player.index_Y < 485)) && getLevel() == 6) {
            setLevel(21); // Mine
        }

        // DOCK
        if (player.index_X> 1200 && player.index_Y<363 && getLevel() == 7) {
            setLevel(1); // Town
        }
        if (player.index_X< 120 && getLevel() == 7) {
            setLevel(8); // Beach
        }
        if (player.index_X> 319 && player.index_X< 565 && player.index_Y < 296 && getLevel() == 7) {
            setLevel(9); // Ski Village
        }

        // BEACH
        if (player.index_X> 1152 && player.index_Y < 426 && player.index_Y > 332 && getLevel() == 8) {
            setLevel(7); // Dock
        }
        if ((player.index_X> 378 && player.index_X< 474 && player.index_Y < 381) && getLevel() == 8) {
            setLevel(14); // Lighthouse

        }

        // SKI VILLAGE

        if (player.index_X> 227 && player.index_X< 514 && player.index_Y > 732 && getLevel() == 9) {
            setLevel(7); // Dock
        }
        if (player.index_X< 385 && player.index_Y < 538 && getLevel() == 9) {
            setLevel(10); // Ski Hill
        }
        if ((player.index_X> 990 && player.index_X< 1044 && player.index_Y < 350) && getLevel() == 9) {
            setLevel(11); // Ski Lodge
        }

        // SKI HILL
        if (((player.index_X> 835 && player.index_Y < 267) || (player.index_X> 762 && player.index_Y < 248))&& getLevel() == 10) {
            setLevel(9); // Ski Village

        }

        // SKI LODGE
        if ((player.index_Y > 539 && player.index_Y < 647 && player.index_X< 190) && getLevel() == 11) {
            setLevel(9); // Ski Village

        }

        // NIGHT CLUB - 12
        if (((player.index_Y > 460 && player.index_Y < 564) && (player.index_X< 210)) && getLevel() == 12) {
            setLevel(1); // Downtown

        }

        // COFFEE SHOP - 13
        if (((player.index_X> 698 && player.index_X< 764) && (player.index_Y < 370)) && getLevel() == 13) {
            setLevel(1); // Downtown
        }

        // LIGHTHOUSE - 14
        if ((player.index_X> 368 && player.index_X< 483 && player.index_Y > 420) && getLevel() == 14) {
            setLevel(8); // Beach

        }
        if((player.index_X < 300 && player.index_Y<300 && getLevel()==14)){
            setLevel(15); // Beacon
        }
        // BEACON - 15
        if(player.index_X > 91 && player.index_X<232 && player.index_Y>540 && player.index_Y<665 && getLevel()==15){
            setLevel(14); // Lighthouse
        }


        // GIFT SHOP - 16
        if (((player.index_X> 960 && player.index_X< 1110) && (player.index_Y < 448)) && getLevel() == 16) {
            setLevel(1); // Downtown
        }
        
        // ICE RINK - 17
        if (((player.index_X> 693 && player.index_X< 766) && (player.index_Y < 190)) && getLevel() == 17) {
            setLevel(2); // Snowfort
        }

        // STAGE - 18
        if (((player.index_X< 179) && (player.index_Y > 601 && player.index_Y < 676)) && getLevel() == 18) {
            setLevel(3); // Plaza
        }

        // PET SHOP - 19
        if (((player.index_X> 608 & player.index_X< 939) && (player.index_Y < 384)) && getLevel() == 19) {
            setLevel(3); // Plaza
        }
        
        // PIZZA PARLOR - 20
        if (((player.index_X> 680 && player.index_X< 894) && player.index_Y < 427) && getLevel() == 20) {
            setLevel(3); // Plaza
        }

        // MINE
        if (((player.index_X< 208 && player.index_Y > 351 && player.index_Y < 523)) && getLevel() == 21) {
            setLevel(6); // Mine Shack
        }

    }

    public static void setLevel(int level) {
        gp.player.velocity[0] = 0;
        gp.player.velocity[1] = 0;
        if(level == 1){
            levelSprite = LoadSave.getBg(1); // Town
            currentLevel = 1;
            gp.player.index_X= 785;
            gp.player.index_Y = 580;
            gp.stopMusic();
        } else if(level == 2){
            levelSprite = LoadSave.getBg(2); // Snow fort
            currentLevel = 2;
            gp.player.index_X= 709;
            gp.player.index_Y = 450;
            gp.stopMusic();
        } else if(level == 3){
            levelSprite = LoadSave.getBg(3); // Plaza
            currentLevel = 3;
            gp.player.index_X= 709;
            gp.player.index_Y = 560;
            gp.stopMusic();
        } else if(level == 4){
            levelSprite = LoadSave.getBg(4); // forest
            currentLevel = 4;
            gp.player.index_X= 703;
            gp.player.index_Y = 342;
            gp.stopMusic();
        } else if(level == 5){
            levelSprite = LoadSave.getBg(5); // Cove
            currentLevel = 5;
            gp.player.index_X= 709;
            gp.player.index_Y = 560;
            gp.stopMusic();
        } else if(level == 6){
            levelSprite = LoadSave.getBg(6); // Mineschack
            currentLevel = 6;
            gp.player.index_X= 709;
            gp.player.index_Y = 560;
            gp.stopMusic();
        } else if(level == 7){
            levelSprite = LoadSave.getBg(7); // DOCK
            currentLevel = 7;
            gp.player.index_X= 709;
            gp.player.index_Y = 560;
            gp.stopMusic();
        } else if(level == 8){
            levelSprite = LoadSave.getBg(8); // Beach
            currentLevel = 8;
            gp.player.index_X= 785;
            gp.player.index_Y = 580;
            gp.stopMusic();
        } else if(level == 9){
            levelSprite = LoadSave.getBg(9); // Ski Village
            currentLevel = 9;
            gp.player.index_X= 785;
            gp.player.index_Y = 580;
            gp.stopMusic();
        } else if(level == 10){
            levelSprite = LoadSave.getBg(10); // Ski hill
            currentLevel = 10;
            gp.player.index_X= 785;
            gp.player.index_Y = 580;
            gp.stopMusic();
        } else if(level == 11){
            levelSprite = LoadSave.getBg(11); // Ski lodge
            currentLevel = 11;
            gp.player.index_X= 709;
            gp.player.index_Y = 560;
            gp.stopMusic();
        } else if(level == 12){
            levelSprite = LoadSave.getBg(12); // night club 1 
            currentLevel = 12;
            gp.player.index_X= 785;
            gp.player.index_Y = 580;
            gp.playMusic(1);
        } else if(level == 13){
            levelSprite = LoadSave.getBg(13); // coffe shop
            currentLevel = 13;
            gp.player.index_X= 531;
            gp.player.index_Y = 580;
            gp.playMusic(0);
        } else if(level == 14){
            levelSprite = LoadSave.getBg(14); // lighthouse
            currentLevel = 14;
            gp.player.index_X= 709;
            gp.player.index_Y = 560;
            gp.stopMusic();
        } else if(level == 15){
            levelSprite = LoadSave.getBg(15); // beacon
            currentLevel = 15;
            gp.player.index_X= 392;
            gp.player.index_Y = 686;
            gp.stopMusic();
        } else if(level == 16){
            levelSprite = LoadSave.getBg(16); // gift shop
            currentLevel = 16;
            gp.playMusic(3);
            gp.player.index_X= 785;
            gp.player.index_Y = 580;
        } else if(level == 17){
            levelSprite = LoadSave.getBg(17); // ice rink
            currentLevel = 17;
            gp.player.index_X= 785;
            gp.player.index_Y = 580;
            gp.stopMusic();
        } else if(level == 18){
            levelSprite = LoadSave.getBg(18); // stage
            currentLevel = 18;
            gp.player.index_X= 785;
            gp.player.index_Y = 580;
            gp.stopMusic();
        } else if(level == 19){
            levelSprite = LoadSave.getBg(19); // pet shop
            currentLevel = 19;
            gp.player.index_X= 785;
            gp.player.index_Y = 580;
            gp.stopMusic();
        } else if(level == 20){
            levelSprite = LoadSave.getBg(20); // pizza parlor
            currentLevel = 20;
            gp.player.index_X= 785;
            gp.player.index_Y = 580;
            gp.playMusic(2);
        } else if(level == 21){
            levelSprite = LoadSave.getBg(21); // Mine
            currentLevel = 21;
            gp.player.index_X= 709;
            gp.player.index_Y = 560;
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
