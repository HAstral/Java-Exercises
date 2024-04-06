package chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class absolute extends JFrame {
	JButton ok;
	public absolute() {
		Container cp=getContentPane();
			ok=new JButton("OK");
			cp.setLayout(null);
			cp.setBackground(Color.LIGHT_GRAY);
			ok.setBounds(70, 125, 80, 30);
			
			cp.add(ok);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		absolute ab=new absolute();
		ab.setVisible(true);
	}

}
