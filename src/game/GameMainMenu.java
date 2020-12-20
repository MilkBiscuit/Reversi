package game;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import enumerate.GameMode;

public class GameMainMenu {

    private static JButton btnHumanVsHuman = new JButton("Human vs Human");
    private static JButton btnHumanVsAi = new JButton("Human vs AI");
    private static JButton btnAiVsAi = new JButton("AI vs AI");
    private static JFrame jFrame = new JFrame("Othello Game");

    public static void main(String[] args) {
        JPanel jContentPanel = new JPanel();
        jContentPanel.setBorder(new EmptyBorder(100, 100, 100, 100));
        jContentPanel.setLayout(new BoxLayout(jContentPanel, BoxLayout.Y_AXIS));
        jFrame.setContentPane(jContentPanel);

        List<JButton> buttonList = Arrays.asList(btnHumanVsHuman, btnHumanVsAi, btnAiVsAi);
        buttonList.forEach(it -> {
            applyButtonStyle(it);
            jContentPanel.add(it);
        });
        btnHumanVsHuman.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                launchGame(GameMode.HUMAN_HUMAN);
            }
        });
        btnAiVsAi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                launchGame(GameMode.AI_AI);
            }
        });
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void applyButtonStyle(JButton button) {
        button.setFont(new Font("", Font.PLAIN, 40));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    private static void launchGame(GameMode mode) {
        JFrame gameFrame = new GameWindow(mode);
        gameFrame.pack();
        jFrame.setSize(gameFrame.getSize());
        jFrame.add(gameFrame);
    }

}
