package khataherumna.screens;

import javax.swing.JFrame;

import khataherumna.modules.CreateFrameOnButtonPressed;

public class AboutUs {
     public static void createAboutUs(JFrame frame, String title) {
          JFrame addAboutUs = CreateFrameOnButtonPressed.createFrameOnButtonPressed(frame, title);
          frame.dispose();
          addAboutUs.setTitle("About Us");
     }
}
