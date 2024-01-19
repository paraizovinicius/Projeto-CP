package Main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import Entity.Player;
import Tiles.TileManager;
import levels.LevelHandler;

public class GamePanel extends JPanel implements Runnable {

    // FPS
    final int FPS = 60;

    // SCREEN SETTINGS
    final int SCREEN_WIDTH = 1440;
    final int SCREEN_HEIGHT = 832;
    final Dimension SCREEN_SIZE = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);
    public final int tileSize = 32;
    public final int tileCol = SCREEN_WIDTH / tileSize;
    public final int tileRow = SCREEN_HEIGHT / tileSize;

    // Instanciando as classes
    KeyHandler key = new KeyHandler();
    MouseHandler mouse = new MouseHandler();
    MouseMotionHandler mouseMotion = new MouseMotionHandler();
    Player player = new Player(785, 525, mouse, mouseMotion, this);
    LevelHandler levelHandler = new LevelHandler();
    Thread gameThread;
    TileManager tileManager = new TileManager(this);
    public CollisionChecker collisionChecker = new CollisionChecker(this);
    

    public GamePanel() {

        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(key); // adiciona o KeyListener ao GamePanel
        this.addMouseListener(mouse);// adiciona o MouseListener ao GamePanel
        this.addMouseMotionListener(mouseMotion);// adiciona o MouseMotionListener ao GamePanel
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

    public void update() {

        player.update();
        levelHandler.update();
        tileManager.update();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g; // transformar essa variável em Graphics2D, que é melhor
        levelHandler.draw(g2);
        player.draw(g2);
        tileManager.draw(g2);

        g2.dispose();

    }

}
