package game;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import enumerate.GameMode;

public class GameWindow extends JFrame {

    public GameWindow(GameMode mode) {
        GamePanel gp = new GamePanel(mode);
        this.add(gp);
        this.setTitle("Reversi v0.1");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GameWindow(GameMode.AI_AI);
    }

}
