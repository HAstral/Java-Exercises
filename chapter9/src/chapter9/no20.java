package chapter9;
import java.util.*;
public class no20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st=s.nextLine();
		while (st.length()!=0) {
			
		
		StringTokenizer sz=new StringTokenizer(st," ");
		ArrayList <StringBuffer> sb=new ArrayList <StringBuffer>();
		while (sz.hasMoreTokens()) {
			StringBuffer str=new StringBuffer(sz.nextToken());
			StringBuffer rev=str.reverse();
			sb.add(rev);
		}
		System.out.println("reverse string is : ");
		for(StringBuffer a : sb) {
			System.out.print(a+" ");
		}
		System.out.println("\nEnter a string: ");
		st=s.next();
		}
		System.out.println("End of program.");
	}

}
