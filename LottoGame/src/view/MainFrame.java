package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JButton historyButton;
    private JButton playButton;
    private JButton statsButton;
    private JButton buyCardButton;
    private JButton logOutButton;

    public MainFrame(){
        super("Šime's lotto");
        setLayout(new BorderLayout());
        setSize(1000, 600);
        setVisible(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        initAll();
        layoutAll();
        activateApp();
    }

    private void initAll() {
        historyButton = new JButton("HISTORY");
        historyButton.setSize(10,5);
        playButton = new JButton("PLAY");
        playButton.setSize(10,5);
        statsButton = new JButton("STATISTICS");
        statsButton.setSize(10,5);
        buyCardButton = new JButton("BUY CARD");
        buyCardButton.setSize(10,5);
        logOutButton = new JButton("LOG OUT");
        logOutButton.setSize(10,5);

    }

    private void layoutAll() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.weightx = 0;
        gbc.weighty = 1;

        add(playButton, gbc);
        gbc.gridy++;
        add(buyCardButton, gbc);
        gbc.gridy++;
        add(historyButton, gbc);
        gbc.gridy++;
        add(statsButton, gbc);
        gbc.gridy++;
        add(logOutButton, gbc);


    }

    private void activateApp() {
    }


}
