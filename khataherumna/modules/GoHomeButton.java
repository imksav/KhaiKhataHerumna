package khataherumna.modules;

import javax.swing.JButton;

public class GoHomeButton {
     public static void createButton(CreateFrame currentFrame, CreateFrame homePageFrame) {
          JButton home = new JButton("Go to Home");
          currentFrame.add(home);
          home.addActionListener(al -> {
               currentFrame.dispose();
               homePageFrame.setVisible(true);
          });
     }
}
