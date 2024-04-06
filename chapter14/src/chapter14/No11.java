//package chapter14;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//public class No11 extends JFrame implements ActionListener{
//	private static final int FRAME_WIDTH = 300;
//	private static final int FRAME_HEIGHT = 200; 
//	private static final int FRAME_X_ORIGIN = 150;
//	private static final int FRAME_Y_ORIGIN = 250;
//	JTextField tf;
//	JTextArea jta;
//	private JScrollPane js;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		No11 ex=new No11();
//		ex.setVisible(true);
//	}
//	public No11() {
//		Container cp;
//		JButton jb;
//		JPanel n,bu,pr;
//		setSize(FRAME_WIDTH, FRAME_HEIGHT);
//		setTitle  ("Prime Ejecter"); 
//		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		cp=getContentPane();
//		cp.setBackground(Color.white);
//		cp.setLayout(new FlowLayout());
//		
//		
//		tf=new JTextField();
//		tf.setColumns(9);
//		
//		cp.add(tf);
//		tf.addActionListener(this);
//    	jb=new JButton("Generate");
//		cp.add(jb);
//		jb.addActionListener(this);
//		
//		jta=new JTextArea();
//		jta.setColumns(20);
//		jta.setRows(7);
//		jta.setEditable(false);
//		cp.add(jta);
//		js=new JScrollPane(jta);
//		js.setSize(300,125);
//		cp.add(js);
//	}
//	public void ActionPerformed(ActionEvent e) {
//		if(e.getSource().equals(jb)) {
//			int co=Integer.parseInt(tf.getText());
//		}
//	}
//
//
//}
//		