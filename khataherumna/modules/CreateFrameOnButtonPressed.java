package khataherumna.modules;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CreateFrameOnButtonPressed {
     public static JFrame createFrameOnButtonPressed(JFrame frame, String title) {
          frame.dispose();
          CreateFrame systemFrame = new CreateFrame(500, 500, title);
          JLabel text = new JLabel(title);
          systemFrame.add(text);
          System.out.println(text);
          return systemFrame;
     }

}
