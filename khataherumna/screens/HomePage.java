package khataherumna.screens;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import khataherumna.modules.CreateFrameOnButtonPressed;

public class HomePage {
     private static JButton addKhataButton;
     private JButton deleteKhataButton;
     private JButton aboutUsButton;
     private JLabel addPageTitle;
     private JPanel homPanel;
     private JFrame homeFrame;

   

     public static void createHomePage(JFrame frame, String title) {
          JFrame addHomePage = CreateFrameOnButtonPressed.createFrameOnButtonPressed(frame, title);
          addHomePage.setTitle("Home Page");
          addHomePage.setLocation(400, 200);
          addKhataButton = new JButton();
          addKhataButton.setText("text");

     }

}
