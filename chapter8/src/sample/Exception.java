package sample;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String s=null;
		System.out.println(s.charAt(0));
		int num = 100/0;	
		System.out.println("Java Exception Example");	*/
		try {
			int num = 100 / 0;
		      } 
		catch (ArithmeticException e) {
			System.out.println(e);
		      }
		System.out.println("Java Exception Example");

	}

}
