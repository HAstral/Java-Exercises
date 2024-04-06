package chapter14;
import javax.swing.*;
import java.awt.*;
public class Ch14ButtonFrame extends JFrame{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static final int FRAME_X_ORIGIN= 150;
	private static final int FRAME_Y_ORIGIN= 250;
	private JButton cancel,ok;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch14ButtonFrame fr=new Ch14ButtonFrame();
		fr.setVisible(true);
	}
	public Ch14ButtonFrame() {
		Container contentPane=getContentPane();
		setTitle ("Prongram Ch14ButtonFrame");
		setSize (FRAME_WIDTH,FRAME_HEIGHT);
		setLocation (FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
		setResizable(false);
		contentPane.setLayout(new FlowLayout());
		ok=new JButton("OK");
		contentPane.add(ok);
		cancel=new JButton("Cancel");
		contentPane.add(cancel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
