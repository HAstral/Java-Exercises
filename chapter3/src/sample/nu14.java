package sample;
import java.util.Scanner;
public class nu14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter radius:");
		Integer r=scanner.nextInt();
		final Double pi=3.14;
		Double V=(3.0/4)* pi * Math.pow(r, 3) ;
		System.out.println("The volume is "+V);
		
	}

}
