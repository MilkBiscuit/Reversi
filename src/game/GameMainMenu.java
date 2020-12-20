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

    static JButton btnHumanVsHuman = new JButton("Human vs Human");
    static JButton btnHumanVsAi = new JButton("Human vs AI");
    static JButton btnAiVsAi = new JButton("AI vs AI");

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Othello Game");
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
                // jFrame.setSize(1000, 1000);
            }
        });
        btnAiVsAi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame gameFrame = new GameWindow(GameMode.AI_AI);
                gameFrame.pack();
                jFrame.setSize(gameFrame.getSize());
                jFrame.add(gameFrame);
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

}
