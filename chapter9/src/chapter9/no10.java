package chapter9;
import java.util.*;
public class no10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		st=s.nextLine();
		StringBuffer st1=new StringBuffer(st);
		StringBuffer st2=st1.reverse();
		System.out.println("Output is: "+st2);
	}

}
