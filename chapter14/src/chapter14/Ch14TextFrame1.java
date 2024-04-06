package chapter14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ch14TextFrame1 extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH = 300; private static final int FRAME_HEIGHT = 200; private 
	static final int FRAME_X_ORIGIN = 150; private static final int FRAME_Y_ORIGIN = 250;

	private JButton cancelButton;
	private JButton okButton;
	private JTextField inputLine;
	private JLabel img;
	private JLabel pro;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch14TextFrame1 fr=new Ch14TextFrame1();
		fr.setVisible(true);
	}
	public Ch14TextFrame1() {
		Container contentPane;
		//set the frame properties
		setSize    (FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(true);
		setTitle   ("Program Ch14SecondJFrame");
		setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

		contentPane = getContentPane();
		contentPane.setLayout( new FlowLayout());
		img=new JLabel(new ImageIcon("cat.gif"));
		img.setSize(50,50);
		contentPane.add(img);
		pro=new JLabel();
		pro.setText("Who tf are you?");
		pro.setSize(150,25);
		contentPane.add(pro);
		inputLine = new JTextField( ); 
		inputLine.setColumns(22); 
		contentPane.add(inputLine);
		inputLine.addActionListener(this);
		okButton = new JButton ("OK");
		contentPane.add(okButton);
		
	
		
		cancelButton = new JButton ("CANCEL"); 
		contentPane.add(cancelButton);
		//register this frame as an action listener of the two buttons 
		cancelButton.addActionListener(this);
		okButton.addActionListener(this);

		//register 'Exit upon closing' as a default close operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() instanceof JButton) {
		JButton clickedButton = (JButton) event.getSource();
		String buttonText = clickedButton.getText();
		setTitle("You clicked " + buttonText);
		} else { //the event source is inputLine
		setTitle("You entered '" + inputLine.getText() + "'");
		}
	}

}
