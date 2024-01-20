package Entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import Main.GamePanel;
import Main.MouseHandler;
import Main.MouseMotionHandler;
import levels.LevelHandler;
import levels.LoadSave;

public class Player {
    public int index_X, index_Y;
    MouseHandler mouse;
    MouseMotionHandler mouseMotion;
    GamePanel gamepanel;
    boolean moving = false;
    int spriteCounter = 0;
    int spriteNum = 1;

    // Player's settings
    public int playerSpeed = 10;
    double[] velocity = { 0, 0 };
    int playerWidth = 68;
    int playerHeight = 72;
    public String direction = "sul";
    public Rectangle playerHitbox; // hitBox é onde o collision fará efeito (obs: é menor que um tile 32x32)
    public boolean collisionOn = false;

    public Player(int index_X, int index_Y, MouseHandler mouse, MouseMotionHandler mouseMotion, GamePanel gamepanel) {
        this.index_X = index_X;
        this.index_Y = index_Y;
        this.mouse = mouse;
        this.mouseMotion = mouseMotion;
        this.gamepanel = gamepanel;
        playerHitbox = new Rectangle(0, 0, playerWidth * 4 / 10, playerHeight / 4); // dimensões da hitbox
    }

    public void update() {

        adjustLevel();
        //System.out.println(LevelHandler.getLevel());
        adjustPlayerHitBox();

        if (velocity[0] != 0 || velocity[1] != 0) { // ajuste da boolean moving
            moving = true;
        } else {
            moving = false;
        }

        try { // Mouse Motion do pinguim (ele olha pro mouse)
            if (moving == false && mouse.isEntered == true) {
                direction = witchDirectionIsPlayerMoving(mouseMotion.coordXmouseMotion, mouseMotion.coordYmouseMotion);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        if (mouse.isClicked == true) {
            direction = witchDirectionIsPlayerMoving(mouse.CoordX, mouse.CoordY);
            velocity = calculateVelocity(mouse.CoordX, mouse.CoordY, direction);
            mouse.isClicked = false;
        }

        // Depois que a direção for definida... iremos chamar a função checkTile da
        // classe CollisionChecker e passar o objeto player
        collisionOn = false;
        gamepanel.collisionChecker.checkTile(this);

        // Se collision = false, o player pode se mover
        if (collisionOn == false) {
            try {
                Thread.sleep(10);
                index_X += velocity[0];
                index_Y += velocity[1];
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Erro no movimento do player");
            }
        }
        else{
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // Função de parada
        int distanceThreshold = 40;
        if (Math.abs(index_X - mouse.CoordX) <= distanceThreshold &&
                Math.abs(index_Y - mouse.CoordY) <= distanceThreshold) {
            velocity[0] = 0;
            velocity[1] = 0;
        }

        spriteCounter++;
        if (spriteCounter > 1) { // 10 ciclos de animação
            if (spriteNum == 1) {
                spriteNum = 2;
            } else if (spriteNum == 2) {
                spriteNum = 3;
            } else if (spriteNum == 3) {
                spriteNum = 4;
            } else if (spriteNum == 4) {
                spriteNum = 5;
            } else if (spriteNum == 5) {
                spriteNum = 6;
            } else if (spriteNum == 6) {
                spriteNum = 1;
            }

            spriteCounter = 0;
        }
    }

    public void adjustPlayerHitBox(){
        playerHitbox.x = index_X - playerWidth * 2 / 10;
        playerHitbox.y = index_Y + playerHeight / 4;
    }

    public void adjustLevel() {


        // TOWN
        if (index_X > 1255 && index_Y<550 && LevelHandler.getLevel() == 1) {
            LevelHandler.setLevel(2); // Snowfort
            index_X = 709;
            index_Y = 450;
            velocity[0] = 0;
            velocity[1] = 0;

        }
        if (index_X < 215 && LevelHandler.getLevel() == 1) {
            LevelHandler.setLevel(7); // Dock
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (((index_X > 481 && index_X < 543) && (index_Y < 437)) && LevelHandler.getLevel() == 1) {
            LevelHandler.setLevel(13); // Coffee Shop
            index_X = 531;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (((index_X > 606 && index_X < 691) && (index_Y < 400)) && LevelHandler.getLevel() == 1) {
            LevelHandler.setLevel(12); // Night Club
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (((index_X > 955 && index_X < 1004) && (index_Y < 452)) && LevelHandler.getLevel() == 1) {
            LevelHandler.setLevel(16); // Gift Shop
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // SNOWFORT
        if (index_X < 200 && LevelHandler.getLevel() == 2) {
            LevelHandler.setLevel(1); // Downtown
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (index_X > 1327 && LevelHandler.getLevel() == 2) {
            LevelHandler.setLevel(3); // Plaza
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (((index_X > 402 && index_X < 604) && (index_Y < 350)) && LevelHandler.getLevel() == 2) {
            LevelHandler.setLevel(17); // Ice Rink
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // PLAZA
        if (index_X < 200 && LevelHandler.getLevel() == 3) {
            LevelHandler.setLevel(2); // Snowfort
            index_X = 709;
            index_Y = 450;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (index_X > 1200 && LevelHandler.getLevel() == 3) {
            LevelHandler.setLevel(4); // Forest
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (((index_X > 288 & index_X < 371) && (index_Y < 517)) && LevelHandler.getLevel() == 3) {
            LevelHandler.setLevel(19); // PetShop
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if ((((index_X > 653 && index_X < 739) || (index_X > 858 && index_X < 944)) && (index_Y < 448)) && LevelHandler.getLevel() == 3) {
            LevelHandler.setLevel(18); // Stage
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (((index_X > 1041 && index_X < 1152) && (index_Y < 470)) && LevelHandler.getLevel() == 3) {
            LevelHandler.setLevel(20); // Pizza Parlor
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // FOREST
        if (index_X > 1186 && index_Y > 648 && LevelHandler.getLevel() == 4) {
            LevelHandler.setLevel(5); // Cove
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (index_X > 1139 && index_Y < 312 && LevelHandler.getLevel() == 4) {
            LevelHandler.setLevel(6); // Mine Shack
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (index_X < 107 && index_Y < 293 && LevelHandler.getLevel() == 4) {
            LevelHandler.setLevel(3); // Plaza
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        // COVE
        if (index_Y < 244 && LevelHandler.getLevel() == 5) {
            LevelHandler.setLevel(4); // Forest
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // MINE SHACK
        if (index_Y > 750 && LevelHandler.getLevel() == 6) {
            LevelHandler.setLevel(4); // Forest
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (((index_X > 696 && index_X < 779) && (index_Y < 485)) && LevelHandler.getLevel() == 6) {
            LevelHandler.setLevel(21); // Mine
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // DOCK
        if (index_X > 1200 && index_Y<363 && LevelHandler.getLevel() == 7) {
            LevelHandler.setLevel(1); // Downtown
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (index_X < 120 && LevelHandler.getLevel() == 7) {
            LevelHandler.setLevel(8); // Beach
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (index_X > 319 && index_X < 565 && index_Y < 296 && LevelHandler.getLevel() == 7) {
            LevelHandler.setLevel(9); // Ski Village
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // BEACH
        if (index_X > 1152 && index_Y < 426 && index_Y > 332 && LevelHandler.getLevel() == 8) {
            LevelHandler.setLevel(7); // Dock
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if ((index_X > 378 && index_X < 474 && index_Y < 381) && LevelHandler.getLevel() == 8) {
            LevelHandler.setLevel(14); // Lighthouse
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // SKI VILLAGE

        if (index_X > 227 && index_X < 514 && index_Y > 732 && LevelHandler.getLevel() == 9) {
            LevelHandler.setLevel(7); // Dock
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (index_X < 385 && index_Y < 538 && LevelHandler.getLevel() == 9) {
            LevelHandler.setLevel(10); // Ski Hill
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if ((index_X > 990 && index_X < 1044 && index_Y < 350) && LevelHandler.getLevel() == 9) {
            LevelHandler.setLevel(11); // Ski Lodge
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // SKI HILL
        if (((index_X > 835 && index_Y < 267) || (index_X > 762 && index_Y < 248))&& LevelHandler.getLevel() == 10) {
            LevelHandler.setLevel(9); // Ski Village
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // SKI LODGE
        if ((index_Y > 539 && index_Y < 647 && index_X < 190) && LevelHandler.getLevel() == 11) {
            LevelHandler.setLevel(9); // Ski Village
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // NIGHT CLUB - 12
        if (((index_Y > 460 && index_Y < 564) && (index_X < 210)) && LevelHandler.getLevel() == 12) {
            LevelHandler.setLevel(1); // Downtown
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // COFFEE SHOP - 13
        if (((index_X > 698 && index_X < 764) && (index_Y < 370)) && LevelHandler.getLevel() == 13) {
            LevelHandler.setLevel(1); // Downtown
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // LIGHTHOUSE - 14
        if ((index_X > 368 && index_X < 483 && index_Y > 420) && LevelHandler.getLevel() == 14) {
            LevelHandler.setLevel(8); // Beach
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if((index_X<300 && index_Y<300 && LevelHandler.getLevel()==14)){
            LevelHandler.setLevel(15); // Beacon
            index_X = 392;
            index_Y = 686;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        // BEACON - 15
        if(index_X>91 && index_X<232 && index_Y>540 && index_Y<665 && LevelHandler.getLevel()==15){
            LevelHandler.setLevel(14); // Lighthouse
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }


        // GIFT SHOP - 16
        if (((index_X > 960 && index_X < 1110) && (index_Y < 448)) && LevelHandler.getLevel() == 16) {
            LevelHandler.setLevel(1); // Downtown
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        
        // ICE RINK - 17
        if (((index_X > 693 && index_X < 766) && (index_Y < 190)) && LevelHandler.getLevel() == 17) {
            LevelHandler.setLevel(2); // Snowfort
            index_X = 709;
            index_Y = 450;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // STAGE - 18
        if (((index_X < 170) && (index_Y > 601 && index_Y < 676)) && LevelHandler.getLevel() == 18) {
            LevelHandler.setLevel(3); // Plaza
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // PET SHOP - 19
        if (((index_X > 608 & index_X < 939) && (index_Y < 384)) && LevelHandler.getLevel() == 19) {
            LevelHandler.setLevel(3); // Plaza
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }
        
        // PIZZA PARLOR - 20
        if (((index_X > 680 && index_X < 894) && index_Y < 427) && LevelHandler.getLevel() == 20) {
            LevelHandler.setLevel(3); // Plaza
            index_X = 785;
            index_Y = 580;
            velocity[0] = 0;
            velocity[1] = 0;
        }

        // MINE
        if (((index_X < 208 && index_Y > 351 && index_Y < 523)) && LevelHandler.getLevel() == 21) {
            LevelHandler.setLevel(6); // Mine Shack
            index_X = 709;
            index_Y = 560;
            velocity[0] = 0;
            velocity[1] = 0;
        }

    }

    public void draw(Graphics2D g2) {

        BufferedImage image = LoadSave.getImage(1);
        switch (direction) {
            case "sul":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = LoadSave.getImage(1);
                } else {
                    if (spriteNum == 1) {
                        image = LoadSave.getImage(9); // os do 9 ao 16 são as imagens de movimento do SUL
                    } else if (spriteNum == 2) {
                        image = LoadSave.getImage(10);
                    } else if (spriteNum == 3) {
                        image = LoadSave.getImage(11);
                    } else if (spriteNum == 4) {
                        image = LoadSave.getImage(12);
                    } else if (spriteNum == 5) {
                        image = LoadSave.getImage(13);
                    } else if (spriteNum == 6) {
                        image = LoadSave.getImage(14);
                    }
                }
                break;

            case "norte":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = LoadSave.getImage(2);
                } else {
                    if (spriteNum == 1) {
                        image = LoadSave.getImage(15); // os do 15 ao 21 são as imagens de movimento do NORTE
                    } else if (spriteNum == 2) {
                        image = LoadSave.getImage(16);
                    } else if (spriteNum == 3) {
                        image = LoadSave.getImage(17);
                    } else if (spriteNum == 4) {
                        image = LoadSave.getImage(18);
                    } else if (spriteNum == 5) {
                        image = LoadSave.getImage(19);
                    } else if (spriteNum == 6) {
                        image = LoadSave.getImage(20);
                    }
                }
                break;

            case "leste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = LoadSave.getImage(7);
                } else {
                    if (spriteNum == 1) {
                        image = LoadSave.getImage(45);
                    } else if (spriteNum == 2) {
                        image = LoadSave.getImage(46);
                    } else if (spriteNum == 3) {
                        image = LoadSave.getImage(47);
                    } else if (spriteNum == 4) {
                        image = LoadSave.getImage(48);
                    } else if (spriteNum == 5) {
                        image = LoadSave.getImage(49);
                    } else if (spriteNum == 6) {
                        image = LoadSave.getImage(50);
                    }
                }
                break;

            case "oeste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = LoadSave.getImage(8);
                } else {
                    if (spriteNum == 1) {
                        image = LoadSave.getImage(51);
                    } else if (spriteNum == 2) {
                        image = LoadSave.getImage(52);
                    } else if (spriteNum == 3) {
                        image = LoadSave.getImage(53);
                    } else if (spriteNum == 4) {
                        image = LoadSave.getImage(54);
                    } else if (spriteNum == 5) {
                        image = LoadSave.getImage(55);
                    } else if (spriteNum == 6) {
                        image = LoadSave.getImage(56);
                    }

                }
                break;

            case "nordeste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = LoadSave.getImage(3);
                } else {
                    if (spriteNum == 1) {
                        image = LoadSave.getImage(39);
                    } else if (spriteNum == 2) {
                        image = LoadSave.getImage(40);
                    } else if (spriteNum == 3) {
                        image = LoadSave.getImage(41);
                    } else if (spriteNum == 4) {
                        image = LoadSave.getImage(42);
                    } else if (spriteNum == 5) {
                        image = LoadSave.getImage(43);
                    } else if (spriteNum == 6) {
                        image = LoadSave.getImage(44);
                    }
                }
                break;

            case "noroeste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = LoadSave.getImage(4);
                } else {
                    if (spriteNum == 1) {
                        image = LoadSave.getImage(33);
                    } else if (spriteNum == 2) {
                        image = LoadSave.getImage(34);
                    } else if (spriteNum == 3) {
                        image = LoadSave.getImage(35);
                    } else if (spriteNum == 4) {
                        image = LoadSave.getImage(36);
                    } else if (spriteNum == 5) {
                        image = LoadSave.getImage(37);
                    } else if (spriteNum == 6) {
                        image = LoadSave.getImage(38);
                    }
                }
                break;

            case "sudeste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = LoadSave.getImage(5);
                } else {
                    if (spriteNum == 1) {
                        image = LoadSave.getImage(21);
                    } else if (spriteNum == 2) {
                        image = LoadSave.getImage(22);
                    } else if (spriteNum == 3) {
                        image = LoadSave.getImage(23);
                    } else if (spriteNum == 4) {
                        image = LoadSave.getImage(24);
                    } else if (spriteNum == 5) {
                        image = LoadSave.getImage(25);
                    } else if (spriteNum == 6) {
                        image = LoadSave.getImage(26);
                    }
                }
                break;

            case "sudoeste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = LoadSave.getImage(6);
                } else {
                    if (spriteNum == 1) {
                        image = LoadSave.getImage(27);
                    } else if (spriteNum == 2) {
                        image = LoadSave.getImage(28);
                    } else if (spriteNum == 3) {
                        image = LoadSave.getImage(29);
                    } else if (spriteNum == 4) {
                        image = LoadSave.getImage(30);
                    } else if (spriteNum == 5) {
                        image = LoadSave.getImage(31);
                    } else if (spriteNum == 6) {
                        image = LoadSave.getImage(32);
                    }
                }
                break;

        }
        g2.drawImage(image, index_X - playerWidth / 2, index_Y - playerHeight / 2, playerWidth, playerHeight, null);
        g2.drawRect(playerHitbox.x, playerHitbox.y, playerHitbox.width, playerHitbox.height);

    }

    public String witchDirectionIsPlayerMoving(int CoordXmouse, int CoordYmouse) {
        String direction = "";
        double X = CoordXmouse - index_X;
        double Y = CoordYmouse - index_Y;
        double angle = Math.atan2(X, Y);

        if (Math.abs(angle) <= Math.PI && Math.abs(angle) > 165 * Math.PI / 180) {
            direction = "norte";
        }
        if (Math.abs(angle) >= 0 && Math.abs(angle) < 15 * Math.PI / 180) {
            direction = "sul";
        }
        if (angle > 0) {
            if (Math.abs(angle) <= 165 * Math.PI / 180 && Math.abs(angle) > 98 * Math.PI / 180) {
                direction = "nordeste";
            }
            if (Math.abs(angle) <= 98 * Math.PI / 180 && Math.abs(angle) > 82 * Math.PI / 180) {
                direction = "leste";
            }
            if (Math.abs(angle) <= 82 * Math.PI / 180 && Math.abs(angle) >= 15 * Math.PI / 180) {
                direction = "sudeste";
            }
        } else {
            if (Math.abs(angle) <= 165 * Math.PI / 180 && Math.abs(angle) > 98 * Math.PI / 180) {
                direction = "noroeste";
            }
            if (Math.abs(angle) <= 98 * Math.PI / 180 && Math.abs(angle) > 82 * Math.PI / 180) {
                direction = "oeste";
            }
            if (Math.abs(angle) <= 82 * Math.PI / 180 && Math.abs(angle) >= 15 * Math.PI / 180) {
                direction = "sudoeste";
            }
        }
        return direction;
    }

    public double[] calculateVelocity(int CoordX, int CoordY, String direction) {
        double[] velocity = new double[2];
        double Y = CoordY - index_Y;
        double X = CoordX - index_X;
        double velRelativaY = (playerSpeed * Y) / X;
        double velRelativaX = (playerSpeed * X) / Y;
        int distXorY = Math.abs(CoordX - index_X) - Math.abs(CoordY - index_Y);

        if (CoordX == index_X && CoordY == index_Y) {
            velocity[0] = 0;
            velocity[1] = 0;
        }
        if (direction == "norte") {
            velocity[1] = -playerSpeed;
            if (X > 0) {
                velocity[0] = Math.abs(velRelativaX);
            } else if (X < 0) {
                velocity[0] = Math.abs(velRelativaX) * (-1);
            } else {
                velocity[0] = 0;
            }
        }
        if (direction == "sul") {
            velocity[1] = playerSpeed;
            if (X > 0) {
                velocity[0] = Math.abs(velRelativaX);
            } else if (X < 0) {
                velocity[0] = Math.abs(velRelativaX) * (-1);
            } else {
                velocity[0] = 0;
            }
        }

        if (direction == "leste") {
            velocity[0] = playerSpeed;
            if (Y > 0) {
                velocity[1] = Math.abs(velRelativaY);
            } else if (Y < 0) {
                velocity[1] = Math.abs(velRelativaY) * (-1);
            } else {
                velocity[1] = 0;
            }
        }
        if (direction == "oeste") {
            velocity[0] = -playerSpeed;
            if (Y > 0) {
                velocity[1] = Math.abs(velRelativaY);
            } else if (Y < 0) {
                velocity[1] = Math.abs(velRelativaY) * (-1);
            } else {
                velocity[1] = 0;
            }
        }
        if (direction == "nordeste") {
            if (distXorY > 0) { // X maior que Y
                velocity[0] = playerSpeed;
                velocity[1] = Math.abs(velRelativaY) * (-1);
            } else if (distXorY < 0) { // Y maior que X
                velocity[0] = Math.abs(velRelativaX);
                velocity[1] = -playerSpeed;
            } else {
                velocity[0] = playerSpeed;
                velocity[1] = -playerSpeed;
            }
        }
        if (direction == "noroeste") {
            if (distXorY > 0) { // X maior que Y
                velocity[0] = playerSpeed * (-1);
                velocity[1] = Math.abs(velRelativaY) * (-1);
            } else if (distXorY < 0) { // Y maior que X
                velocity[0] = Math.abs(velRelativaX) * (-1);
                velocity[1] = -playerSpeed;
            } else {
                velocity[0] = -playerSpeed;
                velocity[1] = -playerSpeed;
            }
        }
        if (direction == "sudeste") {
            if (distXorY > 0) {
                velocity[0] = playerSpeed;
                velocity[1] = Math.abs(velRelativaY);
            } else if (distXorY < 0) {
                velocity[0] = Math.abs(velRelativaX);
                velocity[1] = playerSpeed;
            } else {
                velocity[0] = playerSpeed;
                velocity[1] = playerSpeed;
            }
        }
        if (direction == "sudoeste") {
            if (distXorY > 0) { // X maior que Y
                velocity[0] = -playerSpeed;
                velocity[1] = Math.abs(velRelativaY);
            } else if (distXorY < 0) { // Y maior que X
                velocity[0] = Math.abs(velRelativaX) * (-1);
                velocity[1] = playerSpeed;
            } else { // X igual a Y
                velocity[0] = -playerSpeed;
                velocity[1] = playerSpeed;
            }
        }
        return velocity;
    }

}
