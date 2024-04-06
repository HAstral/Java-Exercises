package chapter14;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BTest extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField tf1,tf2;;
	JTextArea ta;
	JRadioButton r1,r2;
	JCheckBox c1,c2,c3,c4;
	ButtonGroup bg;
	JComboBox cmb;
	public BTest(){
		Container cp=getContentPane();
		cp.setLayout(new GridLayout(0,2));
		b1=new JButton("Search");
		b2=new JButton("OK");
		b3=new JButton("Cancel");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		JPanel p=new JPanel(new GridLayout(0,3));
		p.add(b1); p.add(b2); p.add(b3);
		
		setSize(400,400);
		setLocation(200,200);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		String [] che= {"English","Chinese","French","Japanese"};
		cmb=new JComboBox(che);
		l1=new JLabel("Book Name");
		l2=new JLabel("Author");
		l3=new JLabel("Language");
		l4=new JLabel("Genres");
		l5=new JLabel("Type");
		l6=new JLabel("Content");
		tf1=new JTextField();
		tf2=new JTextField();
		r1=new JRadioButton("Music");
		r2=new JRadioButton("Literature");
		c1=new JCheckBox("C1");
		c2=new JCheckBox("C2");
		c3=new JCheckBox("C3");
		c4=new JCheckBox("C4");
		bg=new ButtonGroup();
		ta=new JTextArea();
		
		//JPanel p1=new JPanel(new GridLayout(0,2));
		cp.add(l1);
		cp.add(tf1);
		cp.add(l2);
		cp.add(tf2);
		JPanel ch=new JPanel();
		cp.add(l5);
		ch.add(c1);
		ch.add(c2);
		ch.add(c3);
		ch.add(c4);
		cp.add(ch);
		JPanel ra=new JPanel();
		bg.add(r1); bg.add(r2);
		cp.add(l4);
		ra.add(r1); ra.add(r2);
		cp.add(ra);
		cp.add(l3);
		cp.add(cmb);
		cp.add(l6);
		cp.add(ta);
		cp.add(p,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTest b=new BTest();
		b.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String s="";
		if(e.getSource().equals(b1)) {
			s+=l1.getText()+"\t"+tf1.getText()+"\n";
			s+=tf2.getText()+"\n";
			s+=(String)cmb.getSelectedItem()+"\n";
			if(c1.isSelected())s+=c1.getText()+"\n";
			if(c2.isSelected())s+=c2.getText()+"\n";
			if(c3.isSelected())s+=c3.getText()+"\n";
			if(r1.isSelected())s+=r1.getText()+"\n";
			if(r2.isSelected())s+=r2.getText()+"\n";
			JOptionPane.showMessageDialog(this, s);
		}
		else if(e.getSource().equals(b2)) {
			tf1.setText("");
			tf2.setText("");
			ta.setText("");
			c1.setSelected(false);
			r1.setSelected(false);
			
		}
		else if (e.getSource().equals(b3)) {
			int ans=JOptionPane.showConfirmDialog(this,"Are you sure that you want to exit?");
			if(ans== JOptionPane.YES_OPTION ) {
				System.exit(0);
				
			} 
			
			else {
				System.out.println("canceled");
			}
		}
	}

}
