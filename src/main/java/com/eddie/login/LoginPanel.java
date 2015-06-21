package com.eddie.login;

import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginPanel extends JPanel {

    @Autowired
    private LoginService loginService;

    private static Color BACKGROUND_COLOR = Color.pink;

    private JTextField usernameField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JButton loginBtn = new JButton("Login");

    public LoginPanel() {
        setBackground(BACKGROUND_COLOR);
        setAlignmentY(BOTTOM_ALIGNMENT);

        add(new JLabel("Username:"));
        Dimension dimension = new Dimension(100, 18);
        usernameField.setPreferredSize(dimension);
        passwordField.setPreferredSize(dimension);
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(loginBtn);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }
}
