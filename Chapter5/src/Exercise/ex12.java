package Exercise;
import java.util.*;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter year: ");
		int year=scanner.nextInt();
		if(year%4==0 && year%100!=0)
			System.out.print("It is a leap year.");
		
		else if (year%400==0 && year%100==0 && year%4==0)
			System.out.print("It is a leap year.");
		
		else System.out.print("It is not a leap year.");
		
		
	}

}
