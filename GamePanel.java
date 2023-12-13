import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import java.lang.Math;

public class GamePanel extends JPanel implements Runnable {

    final int FPS = 60;

    // screenSettings
    final int SCREEN_WIDTH = 1400;
    final int SCREEN_HEIGHT = 700;
    final Dimension SCREEN_SIZE = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);

    // Player's settings
    int playerSpeed = 10;
    double[] velocity = { 0, 0 };
    int playerWidth = 20;
    int playerHeight = 40;

    // Instanciando as classes
    KeyHandler key = new KeyHandler();
    MouseHandler mouse = new MouseHandler();
    Player player = new Player(700, 350);
    Thread gameThread;

    public GamePanel() {

        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(key); // adiciona o KeyListener ao GamePanel
        this.addMouseListener(mouse);// adiciona o MouseListener ao GamePanel
        this.setFocusable(true); // GamePanel agora pode focar nos Listeners
        this.setPreferredSize(SCREEN_SIZE);
    }

    public void startGameThread() {
        gameThread = new Thread(this); // estamos passando a classe GamePanel no "this"
        gameThread.start(); // Começando a thread
    }

    @Override
    public void run() { // aqui implementaremos o game Loop (aqui nasce o conceito do tempo - FPS)

        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;

            if (delta >= 1) {
                // UPDATE posição e vida dos characters
                update();
                // DRAW desenhar na tela com as informações atualizadas
                repaint();
                delta--;
            }

        }

    }

    public String witchDirectionIsPlayerMoving(int CoordXmouse, int CoordYmouse) {
        String direction = "";
        double X = CoordXmouse - player.index_X;
        double Y = CoordYmouse - player.index_Y;
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
        double Y = CoordY - player.index_Y;
        double X = CoordX - player.index_X;
        double velRelativaY = (playerSpeed * Y) / X;
        double velRelativaX = (playerSpeed * X) / Y;
        int distXorY = Math.abs(CoordX - player.index_X) - Math.abs(CoordY - player.index_Y);

        if (CoordX == player.index_X && CoordY == player.index_Y) {
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

    public void update() {

        if (mouse.isClicked == true) {
            String direction = witchDirectionIsPlayerMoving(mouse.CoordX, mouse.CoordY);
            velocity = calculateVelocity(mouse.CoordX, mouse.CoordY, direction);
            mouse.isClicked = false;
        }
        try {
            Thread.sleep(20);
            // Sincronize o bloco crítico usando o objeto 'player' como monitor
            synchronized (player) {
                player.index_X += velocity[0];
                player.index_Y += velocity[1];
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        // Função de parada
        int distanceThreshold = 15;
        if (Math.abs(player.index_X - mouse.CoordX) <= distanceThreshold &&
                Math.abs(player.index_Y - mouse.CoordY) <= distanceThreshold) {
            velocity[0] = 0;
            velocity[1] = 0;
        }
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g; // transformar essa variável em Graphics2D, que é melhor

        g2.setColor(Color.white);

        // essa soma permite que eu centralize o player, pois normalmente ele é gerado
        // sempre no canto superior esquerdo
        g2.fillRect(player.index_X - playerWidth / 2, player.index_Y - playerHeight / 2, playerWidth, playerHeight);

        g2.dispose();

    }

}
