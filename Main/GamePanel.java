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

    // GAME STATES
    public int gameState = 0;
    public final int NORMAL_STATE = 0;
    public final int MAP_STATE = 1;

    // Instanciando as classes
    KeyHandler key = new KeyHandler();
    MouseHandler mouse = new MouseHandler();
    MouseMotionHandler mouseMotion = new MouseMotionHandler();
    public Player player = new Player(785, 525, mouse, mouseMotion, this);
    UI ui = new UI(this);
    public LevelHandler levelHandler = new LevelHandler(this);
    TileManager tileManager = new TileManager(this);
    public CollisionChecker collisionChecker = new CollisionChecker(this);
    Sound sound = new Sound();
    Thread gameThread;    

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

        double drawInterval = 1000000000 / FPS; // desenha a tela a cada 0.016 segundos (60 FPS)
        double nextDrawTime = System.nanoTime() + drawInterval;

        while (gameThread != null) {

            // UPDATE posição e vida dos characters
            update();

            // DRAW desenhar na tela com as informações atualizadas
            repaint();

            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime / 1000000; // transformando em milisegundos

                if (remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long) remainingTime);

                nextDrawTime = System.nanoTime() + drawInterval;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public void update() {
        
        ui.update();
        player.update();
        tileManager.update();
        levelHandler.update();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g; // transformar essa variável em Graphics2D, que é melhor

        // Paint the background
        levelHandler.draw(g2);

        // Paint the player
        player.draw(g2);

        // Paint the tiles (ONLY TO SEE TILES FOR LEVEL CREATION)
        //tileManager.draw(g2);

        // Paint the Icons & Game States
        ui.draw(g2); // TA TRAVANDO O JOGO
    
        g2.dispose();

    }

    public void playMusic(int i){
        sound.setFile(i);
        sound.play();
        sound.loop();
    }
    public void stopMusic(){
        try {
            sound.stop();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
