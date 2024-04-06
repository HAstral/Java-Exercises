package chapter14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ch14TextFrame3 extends JFrame implements ActionListener{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 250;
	private static final int FRAME_X_ORIGIN = 150; 
	private static final int FRAME_Y_ORIGIN = 250;
	private static final String EMPTY_STRING = "";
	private static final String NEWLINE	= System.getProperty("line.separator");
	private JButton   clearButton;
	private JButton   addButton; 
	private JTextField inputLine; 
	private JTextArea textArea;
	private JScrollPane js;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch14TextFrame3 frame = new Ch14TextFrame3();
		frame.setVisible(true);

	}
	public Ch14TextFrame3() {
		Container contentPane;
		//set the frame properties
		setSize    (FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(true);
		setTitle   ("Program Ch14TextFrame3"); 
		setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

		contentPane = getContentPane(); 
		contentPane.setLayout(new FlowLayout ());
		textArea = new JTextArea(); 
		textArea.setColumns(22);
		textArea.setRows(8);
		textArea.setBorder(BorderFactory.createLineBorder(Color.RED));

textArea.setEditable(false);
contentPane.add(textArea);
js=new JScrollPane(textArea);
js.setSize(200,135);
contentPane.add(js);

inputLine = new JTextField(); 
inputLine.setColumns(22); 
contentPane.add(inputLine);

inputLine.addActionListener(this);
//create and place two buttons on the frame
	addButton = new JButton ("ADD"); 
		contentPane.add(addButton);

clearButton = new JButton ("CLEAR");
contentPane.add(clearButton);
//register this frame as an action listener of the two buttons 
clearButton.addActionListener(this); 
addButton.addActionListener(this);

//register 'Exit upon closing' as a default close operation
setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() instanceof JButton) {
		JButton clickedButton = (JButton) event.getSource();
		if (clickedButton == addButton) {
		addText(inputLine.getText());
		} else {
		clearText();
		}
		} else { //the event source is inputLine
		addText(inputLine.getText());
		}
		}
		private void addText(String newline) {
		textArea.append(newline + NEWLINE);
		inputLine.setText("");
		}

		private void clearText() 
		{ textArea.setText(EMPTY_STRING); 
		inputLine.setText(EMPTY_STRING);
		}

	}

