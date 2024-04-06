package chapter9;

public class eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("Hello");
		System.out.println(s1.append("Java"));
		System.out.println(s1.insert(5," "));

		StringBuffer s2=new StringBuffer("Welcome");
		System.out.println(s2.insert(1, "UCSY"));
		System.out.println(s2.replace(1, 5, ""));
		//System.out.println(s2.delete(1,5));
		s2=s2.replace(1, 5, "");
		System.out.println(s2);

		StringBuffer s3=new StringBuffer("University");
		System.out.println(s3.delete(2, 5));
		System.out.println(s3.reverse());
		
		StringBuffer s4=new StringBuffer();
		System.out.println(s4.capacity());
		System.out.println(s4.append("Programming"));
		System.out.println(s4.capacity());
		System.out.println(s4.append(" Language"));
		System.out.println(s4.capacity());
		System.out.println(s4.append(" Section at Machine Room"));
		System.out.println(s4.capacity());

		StringBuffer s5=new StringBuffer("Java");
		System.out.println(s5.charAt(2));
		s5.setCharAt(1, 'A');
		s5.setCharAt(3, 'A');
		
		System.out.println(s5);

	}

}
