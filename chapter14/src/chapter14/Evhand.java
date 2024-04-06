package chapter14;

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
public class Evhand extends JFrame implements ActionListener {
JButton ok;
JButton cancel;
Container contentPane;
public Evhand() {
setTitle("GUI Program");
setSize(500, 300);
setLocation(150, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
ok = new JButton("OK");
cancel = new JButton("Cancel");
ok.addActionListener(this);
cancel.addActionListener(this);
contentPane.add(ok);
contentPane.add(cancel);
}
public static void main(String[] args) {
Evhand ev = new Evhand();
ev.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e1) {
if (e1.getSource().equals(ok)) {
	JOptionPane.showMessageDialog( null, "Ok button is clicked.");
}
if (e1.getSource().equals(cancel)) {
	JOptionPane.showMessageDialog( null, "Cancel button is clicked.");
}
}
}


