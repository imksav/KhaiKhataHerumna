package khataherumna.modules;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CreateFrameOnButtonPressed {
     public static JFrame createFrameOnButtonPressed(JFrame frame, String title) {
          frame.dispose();
          CreateFrame systemFrame = new CreateFrame(500, 500, title);
          return systemFrame;
     }

}
