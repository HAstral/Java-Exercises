package sample;
import java.util.Scanner;

public class nu8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Celsius:");
		Double cel=scanner.nextDouble();
		Double fah=1.8*cel + 32;
		System.out.println(fah + "in Fahrenheit");
		
	}

}
