package khataherumna.lib;

import khataherumna.screens.LoginFrame;
import java.awt.*;

import javax.swing.*;

public class Main {
     public static void main(String[] args) {
          LoginFrame login = new LoginFrame();
          login.setTitle("Login Form");
          login.setVisible(true);
          login.setBounds(10, 10, 370, 600);
          login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          login.setResizable(false);

     }
}
