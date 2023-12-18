package Main;
import javax.swing.*;

public class Client {

    public static void main(String[] args) {
        JFrame window = new JFrame();

        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Club Penguin"); 

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack(); // window fit the preferred sizes of its subcomponents (neste caso, GamePanel)

        window.setLocationRelativeTo(null); // Exibe no meio da tela
        window.setVisible(true);        // Exibe a janela

        gamePanel.startGameThread();
        
    }
}
