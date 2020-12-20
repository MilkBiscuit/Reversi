package game;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import enumerate.GameMode;

public class GameMainMenu {

    static JButton btnHumanVsHuman, btnHumanVsAi, btnAiVsAi;

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Othello Game");
        JPanel jContentPanel = new JPanel();
        jContentPanel.setBorder(new EmptyBorder(100, 100, 100, 100));
        jContentPanel.setLayout(new BoxLayout(jContentPanel, BoxLayout.Y_AXIS));
        jFrame.setContentPane(jContentPanel);

        List<JButton> buttonList = Arrays.asList(
            new JButton("Human vs AI"),
            new JButton("Human vs Human"),
            new JButton("AI vs AI")
        );
        buttonList.forEach(it -> {
            applyButtonStyle(it);
            jContentPanel.add(it);
        });
        buttonList.get(0).addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new GameWindow(GameMode.HUMAN_AI);
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
