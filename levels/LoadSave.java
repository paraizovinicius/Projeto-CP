package levels;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadSave {
    public static String path = "C:\\Users\\parai\\Documents\\Projeto Club Penguin\\Projeto-CP\\res\\images";

    public static BufferedImage getImage(int a) {
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
            if (a == 9) {
                image = ImageIO.read(new File(path + "\\sul1.png"));
            }
            if (a == 10) {
                image = ImageIO.read(new File(path + "\\sul2.png"));
            }
            if (a == 11) {
                image = ImageIO.read(new File(path + "\\sul3.png"));
            }
            if (a == 12) {
                image = ImageIO.read(new File(path + "\\sul4.png"));
            }
            if (a == 13) {
                image = ImageIO.read(new File(path + "\\sul5.png"));
            }
            if (a == 14) {
                image = ImageIO.read(new File(path + "\\sul6.png"));
            }
            if (a == 15) {
                image = ImageIO.read(new File(path + "\\norte1.png"));
            }
            if (a == 16) {
                image = ImageIO.read(new File(path + "\\norte2.png"));
            }
            if (a == 17) {
                image = ImageIO.read(new File(path + "\\norte3.png"));
            }
            if (a == 18) {
                image = ImageIO.read(new File(path + "\\norte4.png"));
            }
            if (a == 19) {
                image = ImageIO.read(new File(path + "\\norte5.png"));
            }
            if (a == 20) {
                image = ImageIO.read(new File(path + "\\norte6.png"));
            }
            if (a == 21) {
                image = ImageIO.read(new File(path + "\\sudeste1.png"));
            }
            if (a == 22) {
                image = ImageIO.read(new File(path + "\\sudeste2.png"));
            }
            if (a == 23) {
                image = ImageIO.read(new File(path + "\\sudeste3.png"));
            }
            if (a == 24) {
                image = ImageIO.read(new File(path + "\\sudeste4.png"));
            }
            if (a == 25) {
                image = ImageIO.read(new File(path + "\\sudeste5.png"));
            }
            if (a == 26) {
                image = ImageIO.read(new File(path + "\\sudeste6.png"));
            }
            if (a == 27) {
                image = ImageIO.read(new File(path + "\\sudoeste1.png"));
            }
            if (a == 28) {
                image = ImageIO.read(new File(path + "\\sudoeste2.png"));
            }
            if (a == 29) {
                image = ImageIO.read(new File(path + "\\sudoeste3.png"));
            }
            if (a == 30) {
                image = ImageIO.read(new File(path + "\\sudoeste4.png"));
            }
            if (a == 31) {
                image = ImageIO.read(new File(path + "\\sudoeste5.png"));
            }
            if (a == 32) {
                image = ImageIO.read(new File(path + "\\sudoeste6.png"));
            }
            if (a == 33) {
                image = ImageIO.read(new File(path + "\\noroeste1.png"));
            }
            if (a == 34) {
                image = ImageIO.read(new File(path + "\\noroeste2.png"));
            }
            if (a == 35) {
                image = ImageIO.read(new File(path + "\\noroeste3.png"));
            }
            if (a == 36) {
                image = ImageIO.read(new File(path + "\\noroeste4.png"));
            }
            if (a == 37) {
                image = ImageIO.read(new File(path + "\\noroeste5.png"));
            }
            if (a == 38) {
                image = ImageIO.read(new File(path + "\\noroeste6.png"));
            }
            if (a == 39) {
                image = ImageIO.read(new File(path + "\\nordeste1.png"));
            }
            if (a == 40) {
                image = ImageIO.read(new File(path + "\\nordeste2.png"));
            }
            if (a == 41) {
                image = ImageIO.read(new File(path + "\\nordeste3.png"));
            }
            if (a == 42) {
                image = ImageIO.read(new File(path + "\\nordeste4.png"));
            }
            if (a == 43) {
                image = ImageIO.read(new File(path + "\\nordeste5.png"));
            }
            if (a == 44) {
                image = ImageIO.read(new File(path + "\\nordeste6.png"));
            }
            if (a == 45) {
                image = ImageIO.read(new File(path + "\\leste1.png"));
            }
            if (a == 46) {
                image = ImageIO.read(new File(path + "\\leste2.png"));
            }
            if (a == 47) {
                image = ImageIO.read(new File(path + "\\leste3.png"));
            }
            if (a == 48) {
                image = ImageIO.read(new File(path + "\\leste4.png"));
            }
            if (a == 49) {
                image = ImageIO.read(new File(path + "\\leste5.png"));
            }
            if (a == 50) {
                image = ImageIO.read(new File(path + "\\leste6.png"));
            }
            if (a == 51) {
                image = ImageIO.read(new File(path + "\\oeste1.png"));
            }
            if (a == 52) {
                image = ImageIO.read(new File(path + "\\oeste2.png"));
            }
            if (a == 53) {
                image = ImageIO.read(new File(path + "\\oeste3.png"));
            }
            if (a == 54) {
                image = ImageIO.read(new File(path + "\\oeste4.png"));
            }
            if (a == 55) {
                image = ImageIO.read(new File(path + "\\oeste5.png"));
            }
            if (a == 56) {
                image = ImageIO.read(new File(path + "\\oeste6.png"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    public static BufferedImage getBg(int a) {
        BufferedImage image = null;
        try {
            if (a == 1) {
                image = ImageIO.read(new File(path + "\\bg_downtown.png"));
            }
            if (a == 2) {
                image = ImageIO.read(new File(path + "\\bg_snowfort.png"));
            }
            if (a == 3) {
                image = ImageIO.read(new File(path + "\\bg_plaza.png"));
            }
            if (a == 4) {
                image = ImageIO.read(new File(path + "\\bg_forest.png"));
            }
            if (a == 5) {
                image = ImageIO.read(new File(path + "\\bg_cove.png"));
            }
            if (a == 6) {
                image = ImageIO.read(new File(path + "\\bg_mineShack.png"));
            }
            if (a == 7) {
                image = ImageIO.read(new File(path + "\\bg_dock.png"));
            }
            if (a == 8) {
                image = ImageIO.read(new File(path + "\\bg_beach.png"));
            }
            if (a == 9) {
                image = ImageIO.read(new File(path + "\\bg_skiVillage.png"));
            }
            if (a == 10) {
                image = ImageIO.read(new File(path + "\\bg_skiHill.png"));
            }
            if (a == 11) {
                image = ImageIO.read(new File(path + "\\bg_skiLodge.png"));
            }
            if (a == 12) {
                image = ImageIO.read(new File(path + "\\bg_nightClub.png"));
            }
            if (a == 13) {
                image = ImageIO.read(new File(path + "\\bg_coffeShop.png"));
            }
            if (a == 14) {
                image = ImageIO.read(new File(path + "\\lighthouse.png"));
            }
            if (a == 15) {
                image = ImageIO.read(new File(path + "\\bg_beacon.png"));
            }
            if (a == 16) {
                image = ImageIO.read(new File(path + "\\bg_giftShop.png"));
            }
            if(a == 17){
                image = ImageIO.read(new File(path + "\\bg_iceRing.png"));
            }
            if(a == 18){
                image = ImageIO.read(new File(path + "\\bg_stage.png"));
            }
            if(a == 19){
                image = ImageIO.read(new File(path + "\\bg_petShop.png"));
            }
            if(a == 20){
                image = ImageIO.read(new File(path + "\\bg_pizzaParlor.png"));
            }
            if(a == 21){
                image = ImageIO.read(new File(path + "\\bg_mine.png"));
            }
            if(a == 90){
                image = ImageIO.read(new File(path + "\\igloo_1.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;

    }

    public static Image getIcon(int a){
        BufferedImage image = null;
        Image tmp = null;

        try {
            if(a == 1){
                image = ImageIO.read(new File(path + "\\icon_map.png"));

                tmp = image.getScaledInstance(image.getWidth() / 10, image.getHeight() / 10, Image.SCALE_SMOOTH);
                
            }
            if(a == 2){
                image = ImageIO.read(new File(path + "\\icon_map2.png"));

                // Now we're resizing the image above 10 times less than its original size
                tmp = image.getScaledInstance(image.getWidth() / 11, image.getHeight() / 11, Image.SCALE_SMOOTH);

            }
            if(a == 3){
                image = ImageIO.read(new File(path + "\\icon_CPworld.png"));

                tmp = image.getScaledInstance(3 * image.getWidth() / 4, 3 * image.getHeight() / 4, Image.SCALE_SMOOTH);
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao carregar o ícone");
        }
        return tmp;
    }
}
