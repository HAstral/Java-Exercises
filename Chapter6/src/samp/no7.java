package samp;
import java.util.*;
public class no7 {
	public static void main(String []args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number greater than 1:");
	int num=scanner.nextInt();
	
		
	
		do{
			int i=2;
			while(num%i!=0)
				{i++;}
			if (num==i)
				{System.out.println(num+"is prime");}
			else 
				{System.out.println(num+"is not prime");}
	
		System.out.println("Enter a number greater than 1:");
		num=scanner.nextInt();
	}while(num>1);
}
}
