package chapter14;
import javax.swing.*;
import java.awt.*;
public class Ch14FlowLayoutSample extends JFrame{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static final int FRAME_X_ORIGIN= 150;
	private static final int FRAME_Y_ORIGIN= 250;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch14FlowLayoutSample fr=new Ch14FlowLayoutSample();
		fr.setVisible(true);
	}
	public Ch14FlowLayoutSample() {
		Container contentPane;
		JButton b1,b2,b3,b4,b5;
		setTitle ("Program Ch14FlowLayoutSample");
		setSize (FRAME_WIDTH,FRAME_HEIGHT);
		setLocation (FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
		contentPane=getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new FlowLayout());
		b1=new JButton("button1");
		b2=new JButton("button2");
		b3=new JButton("button3");
		b4=new JButton("button4");
		b5=new JButton("button5");
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
		contentPane.add(b5);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}
}
