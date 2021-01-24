package khataherumna.screens;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import khataherumna.modules.CreateFrameOnButtonPressed;

public class HomePage {
     private static JButton addKhataButton;
     private static JButton deleteKhataButton;
     private static JButton aboutUsButton;
     private static JButton exitButton;
     private static JLabel addPageHeader;
     private static JPanel homePanel;
     private static JFrame homeFrame;

     // HomePage() {
     // addKhataButton = new JButton("Add Khata");
     // deleteKhataButton = new JButton("Delete Khata");
     // aboutUsButton = new JButton("About Us");
     // }

     public static void createHomePage(JFrame frame, String title) {
          JFrame addHomePage = CreateFrameOnButtonPressed.createFrameOnButtonPressed(frame, title);
          addHomePage.setTitle("Home Page");
          addHomePage.setSize(500, 500);
          addHomePage.setLocation(400, 400);
          // addPageHeader = new JLabel();
          // addPageHeader.setText("This is homepage of our system.");
          addHomePage.add(addPageHeader);
          addKhataButton = new JButton("Add Khata");
          addHomePage.add(addKhataButton);
          deleteKhataButton = new JButton("Delete Khata");
          addHomePage.add(deleteKhataButton);
          aboutUsButton = new JButton("About Us");
          addHomePage.add(aboutUsButton);
          exitButton = new JButton("Exit");
          addHomePage.add(exitButton);
          addHomePage.setLayout(new FlowLayout());

          addKhataButton.addActionListener(e -> System.out.println("Add Khata Clicked!"));
          deleteKhataButton.addActionListener(e -> System.out.println("Delete Khata Clicked!"));
          aboutUsButton.addActionListener(e -> System.out.println("About Us Button Clicked!"));
          exitButton.addActionListener(e -> System.out.println("Exit Button Clicked!"));

     }

}
