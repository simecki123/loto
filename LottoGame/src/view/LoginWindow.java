package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame {

    private JPanel loginPanel;
    private JPanel registerPanel;

    private JButton loginButton;
    private JButton registerButton;

    private JTextField emailField;
    private JTextField passwordField;

    private JTextField registerName;
    private JTextField registerSurname;
    private JTextField registerEmail;
    private JTextField registerPasswd;
    private JTextField confirmPaswd;
    private JButton confirmButton;
    private JButton cancleButton;

    private Container cpane;
    protected CardLayout cardLayout;




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



    private void layoutAll() {
        cardLayout = new CardLayout();
        cpane = getContentPane();
        setLayout(cardLayout);
        cpane.add("1", loginPanel);
        cpane.add("2",registerPanel);
        cpane.setLayout(cardLayout);
    }

    private void initAll() {
        loginPanel = new JPanel();
        loginButton = new JButton("LOGIN");
        registerButton = new JButton("REGISTER");
        emailField = new JTextField(10);
        passwordField = new JPasswordField(10);
        layoutLoginPanel();

        registerPanel = new JPanel();
        registerName = new JTextField(10);
        registerSurname = new JTextField(10);
        registerEmail = new JTextField(10);
        registerPasswd = new JTextField(10);
        confirmPaswd = new JTextField(10);
        confirmButton = new JButton("CONFIRM");
        cancleButton = new JButton("CANCEL");
        layoutRegisterPanel();



    }

    private void layoutRegisterPanel() {
        registerPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 1;
        gbc.gridy = 0;

        gbc.weightx = 0;
        gbc.weighty = 0;

        JLabel nameLabel = new JLabel("Name:                     ");
        JLabel surnameLabel = new JLabel("Surname:               ");
        JLabel emailLabel = new JLabel("Email:                     ");
        JLabel passwordLabel = new JLabel("Password:               ");
        JLabel confPasswordLabel = new JLabel("Confirm Password: ");

        registerPanel.add(nameLabel, gbc);
        gbc.gridy++;
        registerPanel.add(registerName, gbc);
        gbc.gridy++;
        registerPanel.add(new JLabel("  "), gbc);
        gbc.gridy++;

        registerPanel.add(surnameLabel, gbc);
        gbc.gridy++;
        registerPanel.add(registerSurname, gbc);
        gbc.gridy++;
        registerPanel.add(new JLabel("  "), gbc);
        gbc.gridy++;

        registerPanel.add(emailLabel, gbc);
        gbc.gridy++;
        registerPanel.add(registerEmail, gbc);
        gbc.gridy++;
        registerPanel.add(new JLabel("  "), gbc);
        gbc.gridy++;

        registerPanel.add(passwordLabel, gbc);
        gbc.gridy++;
        registerPanel.add(registerPasswd, gbc);
        gbc.gridy++;
        registerPanel.add(new JLabel("  "), gbc);
        gbc.gridy++;

        registerPanel.add(confPasswordLabel, gbc);
        gbc.gridy++;
        registerPanel.add(confirmPaswd, gbc);
        gbc.gridy++;
        registerPanel.add(new JLabel("  "), gbc);
        gbc.gridy++;
        gbc.gridx--;

        registerPanel.add(cancleButton, gbc);
        gbc.gridx++;
        gbc.gridx++;
        registerPanel.add(confirmButton, gbc);




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

    private void activateApp() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cpane);
            }
        });

        cancleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cpane);
            }
        });
    }

}
