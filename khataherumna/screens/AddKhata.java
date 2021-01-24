package khataherumna.screens;

import javax.swing.JFrame;

import khataherumna.modules.CreateFrameOnButtonPressed;

public class AddKhata {
     public static void createAddKhata(JFrame frame, String title) {
          JFrame addAddKhata = CreateFrameOnButtonPressed.createFrameOnButtonPressed(frame, title);
          frame.dispose();
          addAddKhata.setTitle("Add Khata");
     }
}
