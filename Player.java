import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Player {
    public int index_X, index_Y;
    public BufferedImage sul1, sul2, sudeste1, sudeste2, leste1, leste2, nordeste1, nordeste2, norte1,
            norte2, noroeste1, noroeste2, oeste1, oeste2, sudoeste1, sudoeste2;
    MouseHandler mouse;
    MouseMotionHandler mouseMotion;
    boolean moving = false;
    int spriteCounter = 0;
    int spriteNum = 1;
    String path = "C:\\Users\\parai\\Documents\\Projeto Club Penguin\\Projeto-CP\\images";

    // Player's settings
    int playerSpeed = 10;
    double[] velocity = { 0, 0 };
    int playerWidth = 68;
    int playerHeight = 72;
    String direction = "sul";

    public Player(int index_X, int index_Y, MouseHandler mouse, MouseMotionHandler mouseMotion) {
        this.index_X = index_X;
        this.index_Y = index_Y;
        this.mouse = mouse;
        this.mouseMotion = mouseMotion;
    }

    public BufferedImage getPlayerImage(int a) {
        BufferedImage image = null;
        try {
            if (a == 1) { // 1 = Sulstill
                image = ImageIO.read(new File(path + "\\SulStill.png"));
            }
            if (a == 2) { // 2 = NorteStill
                image = ImageIO.read(new File(path + "\\NorteStill.png"));
            }
            if (a == 3) { // 3 = NordesteStill
                image = ImageIO.read(new File(path + "\\NordesteStill.png"));
            }
            if (a == 4) { // 4 = NoroesteStill
                image = ImageIO.read(new File(path + "\\NoroesteStill.png"));
            }
            if (a == 5) { // 5 = SudesteStill
                image = ImageIO.read(new File(path + "\\SudesteStill.png"));
            }
            if (a == 6) { // 6 = SudoesteStill
                image = ImageIO.read(new File(path + "\\SudoesteStill.png"));
            }
            if (a == 7) { // 7 = LesteStill
                image = ImageIO.read(new File(path + "\\LesteStill.png"));
            }
            if (a == 8) { // 8 = OesteStill
                image = ImageIO.read(new File(path + "\\OesteStill.png"));
            }
            if(a == 9){
                image = ImageIO.read(new File(path + "\\sul1.png"));
            }
            if(a == 10){
                image = ImageIO.read(new File(path + "\\sul2.png"));
            }
            if(a == 11){
                image = ImageIO.read(new File(path + "\\sul3.png"));
            }
            if(a == 12){
                image = ImageIO.read(new File(path + "\\sul4.png"));
            }
            if(a == 13){
                image = ImageIO.read(new File(path + "\\sul5.png"));
            }
            if(a == 14){
                image = ImageIO.read(new File(path + "\\sul6.png"));
            }
            if(a == 15){
                image = ImageIO.read(new File(path + "\\norte1.png"));
            }
            if(a == 16){
                image = ImageIO.read(new File(path + "\\norte2.png"));
            }
            if(a == 17){
                image = ImageIO.read(new File(path + "\\norte3.png"));
            }
            if(a == 18){
                image = ImageIO.read(new File(path + "\\norte4.png"));
            }
            if(a == 19){
                image = ImageIO.read(new File(path + "\\norte5.png"));
            }
            if(a == 20){
                image = ImageIO.read(new File(path + "\\norte6.png"));
            }
            if(a == 21){
                image = ImageIO.read(new File(path + "\\sudeste1.png"));
            }
            if(a == 22){
                image = ImageIO.read(new File(path + "\\sudeste2.png"));
            }
            if(a == 23){
                image = ImageIO.read(new File(path + "\\sudeste3.png"));
            }
            if(a == 24){
                image = ImageIO.read(new File(path + "\\sudeste4.png"));
            }
            if(a == 25){
                image = ImageIO.read(new File(path + "\\sudeste5.png"));
            }
            if(a == 26){
                image = ImageIO.read(new File(path + "\\sudeste6.png"));
            }
            if(a == 27){
                image = ImageIO.read(new File(path + "\\sudoeste1.png"));
            }
            if(a == 28){
                image = ImageIO.read(new File(path + "\\sudoeste2.png"));
            }
            if(a == 29){
                image = ImageIO.read(new File(path + "\\sudoeste3.png"));
            }
            if(a == 30){
                image = ImageIO.read(new File(path + "\\sudoeste4.png"));
            }
            if(a == 31){
                image = ImageIO.read(new File(path + "\\sudoeste5.png"));
            }
            if(a == 32){
                image = ImageIO.read(new File(path + "\\sudoeste6.png"));
            }
            if(a == 33){
                image = ImageIO.read(new File(path + "\\noroeste1.png"));
            }
            if(a == 34){
                image = ImageIO.read(new File(path + "\\noroeste2.png"));
            }
            if(a == 35){
                image = ImageIO.read(new File(path + "\\noroeste3.png"));
            }
            if(a == 36){
                image = ImageIO.read(new File(path + "\\noroeste4.png"));
            }
            if(a == 37){
                image = ImageIO.read(new File(path + "\\noroeste5.png"));
            }
            if(a == 38){
                image = ImageIO.read(new File(path + "\\noroeste6.png"));
            }
            if(a == 39){
                image = ImageIO.read(new File(path + "\\nordeste1.png"));
            }
            if(a == 40){
                image = ImageIO.read(new File(path + "\\nordeste2.png"));
            }
            if(a == 41){
                image = ImageIO.read(new File(path + "\\nordeste3.png"));
            }
            if(a == 42){
                image = ImageIO.read(new File(path + "\\nordeste4.png"));
            }
            if(a == 43){
                image = ImageIO.read(new File(path + "\\nordeste5.png"));
            }
            if(a == 44){
                image = ImageIO.read(new File(path + "\\nordeste6.png"));
            }
            if(a == 45){
                image = ImageIO.read(new File(path + "\\leste1.png"));
            }
            if(a == 46){
                image = ImageIO.read(new File(path + "\\leste2.png"));
            }
            if(a == 47){
                image = ImageIO.read(new File(path + "\\leste3.png"));
            }
            if(a == 48){
                image = ImageIO.read(new File(path + "\\leste4.png"));
            }
            if(a == 49){
                image = ImageIO.read(new File(path + "\\leste5.png"));
            }
            if(a == 50){
                image = ImageIO.read(new File(path + "\\leste6.png"));
            }
            if(a == 51){
                image = ImageIO.read(new File(path + "\\oeste1.png"));
            }
            if(a == 52){
                image = ImageIO.read(new File(path + "\\oeste2.png"));
            }
            if(a == 53){
                image = ImageIO.read(new File(path + "\\oeste3.png"));
            }
            if(a == 54){
                image = ImageIO.read(new File(path + "\\oeste4.png"));
            }
            if(a == 55){
                image = ImageIO.read(new File(path + "\\oeste5.png"));
            }
            if(a == 56){
                image = ImageIO.read(new File(path + "\\oeste6.png"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    public void update() {
        if (velocity[0] != 0 || velocity[1] != 0) {
            moving = true;
        } else {
            moving = false;
        }

        try {
            if(moving == false && mouse.isEntered == true){
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

        try {
            Thread.sleep(20);
            index_X += velocity[0];
            index_Y += velocity[1];

        } catch (Exception e) {
            // TODO: handle exception
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

    public void draw(Graphics2D g2) {
        // g2.setColor(Color.white);

        // essa soma permite que eu centralize o player, pois normalmente ele é gerado
        // sempre no canto superior esquerdo
        // g2.fillRect(index_X - playerWidth / 2, index_Y - playerHeight / 2,
        // playerWidth, playerHeight);

        BufferedImage image = getPlayerImage(1);
        switch (direction) {
            case "sul":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = getPlayerImage(1);
                } else {
                    if (spriteNum == 1) {
                        image = getPlayerImage(9); // os do 9 ao 16 são as imagens de movimento do SUL
                    } else if (spriteNum == 2) {
                        image = getPlayerImage(10);
                    } else if( spriteNum == 3){
                        image = getPlayerImage(11);
                    } else if(spriteNum == 4){
                        image = getPlayerImage(12);
                    } else if(spriteNum == 5){
                        image = getPlayerImage(13);
                    } else if(spriteNum == 6){
                        image = getPlayerImage(14);
                    }
                }
                break;

            case "norte":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = getPlayerImage(2);
                } else {
                    if (spriteNum == 1) {
                        image = getPlayerImage(15); // os do 15 ao 21 são as imagens de movimento do NORTE
                    } else if (spriteNum == 2) {
                        image = getPlayerImage(16);
                    } else if( spriteNum == 3){
                        image = getPlayerImage(17);
                    } else if(spriteNum == 4){
                        image = getPlayerImage(18);
                    } else if(spriteNum == 5){
                        image = getPlayerImage(19);
                    } else if(spriteNum == 6){
                        image = getPlayerImage(20);
                    }
                }
                break;

            case "leste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = getPlayerImage(7);
                } else {
                    if(spriteNum == 1){
                        image = getPlayerImage(45);
                    } else if(spriteNum == 2){
                        image = getPlayerImage(46);
                    } else if(spriteNum == 3){
                        image = getPlayerImage(47);
                    } else if(spriteNum == 4){
                        image = getPlayerImage(48);
                    } else if(spriteNum == 5){
                        image = getPlayerImage(49);
                    } else if(spriteNum == 6){
                        image = getPlayerImage(50);
                    }
                }
                break;

            case "oeste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = getPlayerImage(8);
                } else {
                    if(spriteNum == 1){
                        image = getPlayerImage(51);
                    } else if(spriteNum == 2){
                        image = getPlayerImage(52);
                    } else if(spriteNum == 3){
                        image = getPlayerImage(53);
                    } else if(spriteNum == 4){
                        image = getPlayerImage(54);
                    } else if(spriteNum == 5){
                        image = getPlayerImage(55);
                    } else if(spriteNum == 6){
                        image = getPlayerImage(56);
                    }

                }
                break;

            case "nordeste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = getPlayerImage(3);
                } else {
                    if(spriteNum == 1){
                        image = getPlayerImage(39);
                    } else if(spriteNum == 2){
                        image = getPlayerImage(40);
                    } else if(spriteNum == 3){
                        image = getPlayerImage(41);
                    } else if(spriteNum == 4){
                        image = getPlayerImage(42);
                    } else if(spriteNum == 5){
                        image = getPlayerImage(43);
                    } else if(spriteNum == 6){
                        image = getPlayerImage(44);
                    }
                }
                break;

            case "noroeste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = getPlayerImage(4);
                } else {
                    if(spriteNum == 1){
                        image = getPlayerImage(33);
                    } else if(spriteNum == 2){
                        image = getPlayerImage(34);
                    } else if(spriteNum == 3){
                        image = getPlayerImage(35);
                    } else if(spriteNum == 4){
                        image = getPlayerImage(36);
                    } else if(spriteNum == 5){
                        image = getPlayerImage(37);
                    } else if(spriteNum == 6){
                        image = getPlayerImage(38);
                    }
                }
                break;

            case "sudeste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = getPlayerImage(5);
                } else {
                    if(spriteNum == 1){
                        image = getPlayerImage(21);
                    } else if(spriteNum == 2){
                        image = getPlayerImage(22);
                    } else if(spriteNum == 3){
                        image = getPlayerImage(23);
                    } else if(spriteNum == 4){
                        image = getPlayerImage(24);
                    } else if(spriteNum == 5){
                        image = getPlayerImage(25);
                    } else if(spriteNum == 6){
                        image = getPlayerImage(26);
                    }
                }
                break;

            case "sudoeste":
                if (velocity[0] == 0 && velocity[1] == 0) {
                    image = getPlayerImage(6);
                } else {
                    if(spriteNum == 1){
                        image = getPlayerImage(27);
                    } else if(spriteNum == 2){
                        image = getPlayerImage(28);
                    } else if(spriteNum == 3){
                        image = getPlayerImage(29);
                    } else if(spriteNum == 4){
                        image = getPlayerImage(30);
                    } else if(spriteNum == 5){
                        image = getPlayerImage(31);
                    } else if(spriteNum == 6){
                        image = getPlayerImage(32);
                    }
                }
                break;

        }
        g2.drawImage(image, index_X - playerWidth/2, index_Y - playerHeight / 2, playerWidth, playerHeight, null);

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
        System.out.println(velocity[0] + " " + velocity[1]);
        return velocity;
    }

}
