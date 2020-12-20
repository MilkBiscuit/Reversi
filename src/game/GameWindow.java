package game;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import game.enumi.*;

public class GameWindow extends JFrame {

    public GameWindow(GameMode mode) {
        GamePanel gp = new GamePanel(mode);
        gp.setBorder(new EmptyBorder(50, 20, 20, 20));
        this.add(gp);
        this.setTitle("Reversi v0.1");
        // this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GameWindow(GameMode.AI_AI);
    }

}
