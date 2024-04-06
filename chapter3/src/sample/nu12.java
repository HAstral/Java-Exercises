package sample;
import java.util.Scanner;

public class nu12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter weight:");
		Integer w=scanner.nextInt();
		System.out.println("Enter height:");
		Integer h=scanner.nextInt();
		Double BMI=w/((h/100.0)*(h/100.0));
		System.out.println("Your BMI is "+ BMI);
		
		}

}
