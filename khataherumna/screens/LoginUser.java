package khataherumna.screens;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUser extends JFrame {
     private JPanel panel;
     private JLabel welcomeMessage;
     private JButton loginButton, signupButton, forgetButton;
     private JTextField textField;
     private JPasswordField passwordField;

     public LoginUser() {
          setLayout(null);
          setBounds(500, 200, 200, 500);
          panel = new JPanel();
          setContentPane(panel);
          panel.setLayout(null);
          // creating welcome message
          welcomeMessage = new JLabel();
          welcomeMessage.setText("Welcome to KKHT System!");
          welcomeMessage.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
          welcomeMessage.setBounds(100, 25, 400, 100);
          panel.add(welcomeMessage);
          // creating label for username and password
          JLabel username = new JLabel();
          username.setText("Username: ");
          username.setBounds(150, 100, 100, 100);
          panel.add(username);
          JLabel password = new JLabel();
          password.setText("Password: ");
          password.setBounds(150, 140, 100, 100);
          panel.add(password);
          // creating field to enter username and password
          textField = new JTextField();
          textField.setBounds(220, 140, 100, 25);
          panel.add(textField);
          passwordField = new JPasswordField();
          passwordField.setBounds(220, 180, 100, 25);
          panel.add(passwordField);
          // creating buttons
          loginButton = new JButton();
          loginButton.setText("Login");
          loginButton.setBounds(160, 215, 70, 30);
          panel.add(loginButton);
          //
          signupButton = new JButton();
          signupButton.setText("Signup");
          signupButton.setBounds(245, 215, 80, 30);
          panel.add(signupButton);
          //
          forgetButton = new JButton();
          forgetButton.setText("Forget Password");
          forgetButton.setBounds(190, 265, 130, 30);
          panel.add(forgetButton);

          // action goes here for all

     }

     public static void main(String[] args) {
          LoginUser loginUser = new LoginUser();
          loginUser.setTitle("Login User");
          loginUser.setSize(500, 450);
          loginUser.setLocationRelativeTo(null);
          loginUser.setBackground(Color.CYAN);
          loginUser.setResizable(false);
          loginUser.setVisible(true);
     }

}
