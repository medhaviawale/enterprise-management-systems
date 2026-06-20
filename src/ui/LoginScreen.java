package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginScreen() {
        setTitle("Enterprise Management System - Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        // AWT/Swing Components
        add(new JLabel(" Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel(" Password/PIN:"));
        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Secure Login");
        add(new JLabel("")); // empty space
        add(loginButton);

        // Action Listener for Login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for Role-Based Access Control and PIN verification goes here
                JOptionPane.showMessageDialog(null, "Authentication in process...");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginScreen().setVisible(true));
    }
}
