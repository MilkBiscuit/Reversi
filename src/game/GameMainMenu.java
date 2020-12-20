package game;

import java.awt.Component;
import java.awt.Font;
import java.util.Arrays;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
        jFrame.pack();
        jFrame.setVisible(true);
    }

    private static void applyButtonStyle(JButton button) {
        button.setFont(new Font("", Font.PLAIN, 40));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
    }


}
