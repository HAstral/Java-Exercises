package ch13;
interface Print{
	void print();
}
interface Show{
	void print();
}
public class TeInter implements Print,Show {
	public void print() {
		System.out.println("Hello Jungle son");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeInter ti=new TeInter();
		ti.print();
	}

}
