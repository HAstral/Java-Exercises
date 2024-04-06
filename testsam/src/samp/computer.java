package samp;
import java.util.*;
public class computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word;
		int count = 0;


		do {
			System.out.println("Enter words:");

			word=sc.next();
		
			if(word.equalsIgnoreCase("computer")) {
		
				count++;
				System.out.println("The count is "+count);}

			}while(!word.equalsIgnoreCase("stop"));

	

	}

}
