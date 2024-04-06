package chapter14;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class Ch14JFrameSubClass2 extends JFrame{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static final int FRAME_X_ORIGIN= 150;
	private static final int FRAME_Y_ORIGIN= 250;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch14JFrameSubClass2 frame=new Ch14JFrameSubClass2();
		frame.setVisible(true);
	}
	public Ch14JFrameSubClass2() {
		setTitle ("Blue Background JFrame Subclass");
		setSize (FRAME_WIDTH,FRAME_HEIGHT);
		setLocation (FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		changeBkColor();
		}
	private void changeBkColor() {
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.BLUE);
	}

}
