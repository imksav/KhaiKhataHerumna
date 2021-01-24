package khataherumna.screens;

import java.awt.*;
import javax.swing.*;

import khataherumna.modules.CreateFrameOnButtonPressed;

public class HomePage {
     private static JButton addKhataButton;
     private static JButton deleteKhataButton;
     private static JButton aboutUsButton;
     private static JButton exitButton;

     public static void createHomePage(JFrame frame, String title) {
          JFrame addHomePage = CreateFrameOnButtonPressed.createFrameOnButtonPressed(frame, title);
          addHomePage.setTitle("Home Page");
          addHomePage.setSize(500, 500);
          addHomePage.setLocation(300, 300);

          addKhataButton = new JButton("Add Khata");
          addHomePage.add(addKhataButton);
          deleteKhataButton = new JButton("Delete Khata");
          addHomePage.add(deleteKhataButton);
          aboutUsButton = new JButton("About Us");
          addHomePage.add(aboutUsButton);
          exitButton = new JButton("Exit");
          addHomePage.add(exitButton);
          addHomePage.setLayout(new GridLayout(2, 2));

          addKhataButton.addActionListener(e -> AddKhata.createAddKhata(frame, title));
          deleteKhataButton.addActionListener(e -> DeleteKhata.createDeleteKhata(frame, title));
          aboutUsButton.addActionListener(e -> AboutUs.createAboutUs(frame, title));
          // exitButton.addActionListener(e -> frame.setDefaultCloseOperation(true));

     }

}
