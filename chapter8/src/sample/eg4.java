package sample;

class Propagation{
	void method3() {
		String string = "hello";
		System.out.println(string.charAt(10));
		}
		void method2() {
		method3(); 
		}
		void method1() {
		try {
		method2();
		} catch (StringIndexOutOfBoundsException e) {
		System.out.println(e);
		}

}
}
public class eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Propagation p = new Propagation();
		p.method1();  
	}

}

