package chapter14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Mousey extends JFrame implements MouseListener{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 250;
	private static final int FRAME_X_ORIGIN = 150; 
	private static final int FRAME_Y_ORIGIN = 250;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mousey m=new Mousey();
		m.setVisible(true);
	}
	public Mousey() {
		Container cp=getContentPane();
		cp.setBackground(Color.white);
		
		setTitle("TrackMouseFrame");
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		setResizable(false);
		setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount()==2) {
			System.exit(0);
		}else {
			int x,y;
			x=e.getX();
			y=e.getY();
			System.out.println("["+x+","+y+"]");
		}
	}
		public void mouseEntered(MouseEvent e) {
			
		}
		public void mouseExited(MouseEvent e) {
			
		}
		public void mousePressed(MouseEvent e) {
			System.out.println("Down");
		}
		public void mouseReleased(MouseEvent e) {
			System.out.println("Up");
		
	}
	

}
