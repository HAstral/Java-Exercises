package chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch14CheckBoxSample1 extends JFrame implements ActionListener{
	private static final int FRAME_WIDTH = 300; 
	private static final int FRAME_HEIGHT = 200; 
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;

	private JCheckBox[] checkBox;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch14CheckBoxSample1 frame = new Ch14CheckBoxSample1();
		frame.setVisible(true);

	}

public Ch14CheckBoxSample1() {

	Container contentPane;
	JPanel   checkPanel, okPanel;

	JButton  okButton;
	String[] btnText = {"Java", "C++", "Smalltalk", "Ada"};
	//set the frame properties
	setSize   (FRAME_WIDTH, FRAME_HEIGHT);
	setTitle  ("Program Ch14JCheckBoxSample1");
	setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

	contentPane = getContentPane( ); 
	contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(new BorderLayout());
	//create and place four check boxes
	checkPanel = new JPanel(new GridLayout(0,1)); 
	checkPanel.setBorder(BorderFactory.createTitledBorder(	"Can Program In"));




	checkBox = new JCheckBox[btnText.length];
	for (int i = 0; i < checkBox.length; i++) 
	{ checkBox[i] = new JCheckBox(btnText[i]); 
	checkPanel.add(checkBox[i]);
	}
	okPanel = new JPanel(new FlowLayout());
	okButton = new JButton("OK"); 
	okButton.addActionListener(this);
	okPanel.add(okButton);
	contentPane.add(checkPanel, BorderLayout.CENTER); 
	contentPane.add(okPanel, BorderLayout.SOUTH);



	//register 'Exit upon closing' as a default close operation
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
public void actionPerformed(ActionEvent event) {
StringBuffer skill = new StringBuffer("You can program in\n");
for (int i = 0; i < checkBox.length; i++) {

if (checkBox[i].isSelected()) {
skill.append(checkBox[i].getText() + "\n ");
}
}
JOptionPane.showMessageDialog(this, skill.toString());
}


}
