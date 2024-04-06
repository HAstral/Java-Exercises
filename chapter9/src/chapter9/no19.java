package chapter9;
import java.util.*;
public class no19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1,st2;
		char ch;
		Scanner s=new Scanner(System.in);
		StringBuffer str=new StringBuffer();
		while(true) {
			System.out.println("Enter the String:");
			st1=s.nextLine();
			for(int i=0;i<st1.length();i++) {
				ch=st1.charAt(i);
				if(Character.isLowerCase(ch)) {
					ch=Character.toUpperCase(ch);
				}
				else if (Character.isUpperCase(ch)) {
					ch=Character.toLowerCase(ch);
				}
				str.append(ch);
				
				
				
			}
			st2=str.toString();
			System.out.println("The output is: "+st2);	
			
			
		}
	}

}
