package chapter14;
import javax.swing.*;
import java.awt.*;
public class Ch14BorderLayoutSample extends JFrame{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static final int FRAME_X_ORIGIN= 150;
	private static final int FRAME_Y_ORIGIN= 250;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch14BorderLayoutSample fr=new Ch14BorderLayoutSample();
		fr.setVisible(true);
	}
	public Ch14BorderLayoutSample() {
		Container contentPane;
		JButton b1,b2,b3,b4,b5;
		setTitle ("Program Ch14BorderLayoutSample");
		setSize (FRAME_WIDTH,FRAME_HEIGHT);
		setLocation (FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
		contentPane=getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new BorderLayout());
		b1=new JButton("button1");
		b2=new JButton("button2");
		b3=new JButton("button3");
		b4=new JButton("button4");
		b5=new JButton("button5");
		contentPane.add(b1,BorderLayout.NORTH);
		contentPane.add(b2,BorderLayout.SOUTH);
		contentPane.add(b3,BorderLayout.EAST);
		contentPane.add(b4,BorderLayout.WEST);
		contentPane.add(b5,BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}
}
