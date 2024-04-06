package sample;
import java.util.Scanner;

public class nu13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter dollars:");
		Integer P=scanner.nextInt();
		System.out.println("Enter percent interest:");
		Integer R=scanner.nextInt();
		System.out.println("Enter years:");
		Integer N=scanner.nextInt();
		Double result=P*(Math.pow(1+ R/100, N));
		System.out.println("The amount of money earned after "+N +"years is "+result);

	}

}
