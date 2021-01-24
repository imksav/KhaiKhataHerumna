package khataherumna.screens;

import javax.swing.JFrame;

import khataherumna.modules.CreateFrameOnButtonPressed;

public class DeleteKhata {
     public static void createDeleteKhata(JFrame frame, String title) {
          JFrame addDeleteKhata = CreateFrameOnButtonPressed.createFrameOnButtonPressed(frame, title);
          frame.dispose();
          addDeleteKhata.setTitle("Delete Khata");
     }
}
