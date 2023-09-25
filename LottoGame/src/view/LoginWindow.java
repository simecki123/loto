package view;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {

    private JPanel loginPanel;
    private JPanel registerPanel;

    private JButton loginButton;
    private JButton registerButton;

    private JTextField emailField;
    private JTextField passwordField;



    public LoginWindow(){
        super("Šime's lotto");
        setLayout(new BorderLayout());
        setSize(600, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        initAll();
        layoutAll();
        activateApp();
    }

    private void activateApp() {
    }

    private void layoutAll() {
        CardLayout cardLayout = new CardLayout();
        setLayout(cardLayout);
        add(loginPanel);
    }

    private void initAll() {
        loginPanel = new JPanel();
        loginButton = new JButton("LOGIN");
        registerButton = new JButton("REGISTER");
        emailField = new JTextField(10);
        passwordField = new JPasswordField(10);
        layoutLoginPanel();



    }

    private void layoutLoginPanel(){
        loginPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 1;
        gbc.gridy = 0;

        gbc.weightx = 0;
        gbc.weighty = 0;

        JLabel emailLabel = new JLabel("Email:                     ");
        JLabel passwordLabel = new JLabel("Password:               ");

        loginPanel.add(emailLabel, gbc);
        gbc.gridy++;
        loginPanel.add(emailField, gbc);
        gbc.gridy++;

        loginPanel.add(new JLabel("  "), gbc);
        gbc.gridy++;
        loginPanel.add(passwordLabel, gbc);
        gbc.gridy++;
        loginPanel.add(passwordField, gbc);
        gbc.gridy++;

        loginPanel.add(new JLabel("  "), gbc);
        gbc.gridy++;
        gbc.gridx--;
        loginPanel.add(loginButton, gbc);
        gbc.gridx++;
        gbc.gridx++;
        loginPanel.add(registerButton, gbc);


    }

}
