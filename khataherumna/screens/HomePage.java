package khataherumna.screens;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import khataherumna.modules.CreateFrame;

public class HomePage {

     public static void createHomePage() {
          // create panel for frame
          JPanel panel1 = new JPanel();

          // create welcome message label
          JLabel lb = new JLabel("Welcome to Khai Khata Herumna!!!\n");

          // create buttons
          JButton btn1 = new JButton("Btn1");
          JButton btn2 = new JButton("Btn2");
          JButton btn3 = new JButton("Btn3");

          CreateFrame frame = new CreateFrame(500, 500, "Khai Khata Herumna System");
          panel1.setBackground(Color.CYAN);

          frame.add(panel1);
          panel1.add(lb);
          panel1.add(btn1);
          panel1.add(btn2);
          panel1.add(btn3);
          panel1.setSize(500, 500);
          frame.setVisible(true);
          frame.setLocationRelativeTo(null);

     }
}
