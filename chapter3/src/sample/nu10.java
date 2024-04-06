package sample;
import java.util.Scanner;

public class nu10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Fahrenheit:");
		Double fah=scanner.nextDouble();
		Double cel=(5.0/9) * (fah-32);
		System.out.println(cel +"in Celsius");
		
	}

}
