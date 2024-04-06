package chapter14;

import javax.swing.*;
public class JFrameSubclass extends JFrame {
   public JFrameSubclass() {
setTitle("First GUI Program");
setSize(300, 200);
setLocation(150, 250);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
   public static void main(String[] args) {
	 JFrameSubclass jf = new JFrameSubclass();
	 jf.setVisible(true);

	}
}
