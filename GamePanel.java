import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;


public class GamePanel extends JPanel implements Runnable {
    
    final int FPS = 60;

    //screenSettings
    final int SCREEN_WIDTH = 1400;
    final int SCREEN_HEIGHT = 700;
    final Dimension SCREEN_SIZE = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);

    KeyHandler key = new KeyHandler(); // inutil por enquanto
    Listener listener;
    Thread gameThread;

    public GamePanel() {

        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(key); // adiciona o KeyListener ao GamePanel
        this.setFocusable(true); // GamePanel agora pode focar no mouse Listener
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

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g; // transformar essa variável em Graphics2D, que é melhor

        g2.setColor(Color.white);

        g2.fillRect(64, 64, 16, 16);

        g2.dispose();

    }

}
