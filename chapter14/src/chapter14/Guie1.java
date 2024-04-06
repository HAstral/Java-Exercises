package chapter14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Guie1 extends JFrame implements ActionListener{
	JLabel lblName;
	JLabel lblAge;
	JLabel lblSemester;
	JLabel lblLanguage;
	JTextField txtName;
	JTextField txtAge;
	JComboBox semester;
	JCheckBox c1,c2,c3,c4,c5;
	JTextArea detail;
	JButton ok;
	JButton cancel;


public static void main(String[] args) {
Guie1 fobj = new Guie1();
fobj.setVisible(true);
}
public Guie1() {
	Container contentpane = getContentPane();
	contentpane.setLayout(new BorderLayout());
setTitle("GUI Example");
setSize(500,500);
setLocation(150,200);
setDefaultCloseOperation(EXIT_ON_CLOSE);

// Label
lblName = new JLabel("Name");
lblAge = new JLabel("Age");
lblSemester = new JLabel("Semester");
lblLanguage = new JLabel("Can Program in :");
// TextBox
txtName = new JTextField();
txtAge = new JTextField();
// ComboBox
String[] semesterText = {"Semester V", "Semester VI", "Semester VII", "Semester VIII"}; 

semester = new JComboBox(semesterText);

c1=new JCheckBox("C++");
c2=new JCheckBox("Java");
c3=new JCheckBox("C#");
c4=new JCheckBox("Python");
c5=new JCheckBox("Ruby");
JPanel checkPanel = new JPanel(new FlowLayout());
checkPanel.add(lblLanguage);
checkPanel.add(c1);
checkPanel.add(c2);
checkPanel.add(c3);
checkPanel.add(c4);
checkPanel.add(c5);
detail = new JTextArea();
detail.setColumns(80);
detail.setRows(12);
JPanel det=new JPanel();
det.add(detail);
JPanel first = new JPanel(new GridLayout(0,2));
first.add(lblName);
first.add(txtName);
first.add(lblAge);
first.add(txtAge);
first.add(lblSemester);
first.add(semester);
first.add(checkPanel);
JPanel buttonpanel = new JPanel(new FlowLayout());
ok = new JButton("OK");
ok.addActionListener(this);
buttonpanel.add(ok);
cancel = new JButton("CANCEL");
cancel.addActionListener(this);
buttonpanel.add(cancel);
contentpane.add(first, BorderLayout.NORTH);
contentpane.add(det,BorderLayout.CENTER);
contentpane.add(buttonpanel, BorderLayout.SOUTH);
}

public void actionPerformed(ActionEvent e) {
String s="";
if(e.getSource().equals(cancel))
{
System.exit(0);
}
if(e.getSource().equals(ok))
{
// TextBox
s+= txtName.getText()+"\n";
s+= txtAge.getText()+"\n";
 
// ComboBox
s+= (String) semester.getSelectedItem()+"\n";
// CheckBox

if(c1.isSelected())s+=c1.getText()+"\n";
if(c2.isSelected())s+=c2.getText()+"\n";
if(c3.isSelected())s+=c3.getText()+"\n";
if(c5.isSelected())s+=c4.getText()+"\n";
if(c4.isSelected())s+=c5.getText()+"\n";

}
detail.setText("Detail Information: \n");
detail.append(s);
}
}


