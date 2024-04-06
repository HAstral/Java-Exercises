package sample;
import java.util.*;
public class eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age;
		try {

			age = scanner.nextInt( );

		} catch (InputMismatchException e){

			System.out.println("Invalid Entry.Please enter digits only");
		}

	}

}
