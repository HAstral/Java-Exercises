package sample;
import java.util.*;

public class no7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scanner.nextInt();
		while (num>0)
		{
			int divisor=2;
			while (num%divisor!=0)
			{
				divisor++;
			}
			if(num==divisor)
			{
				System.out.println
				("It is prime.");
			}else
				{System.out.println("This is not prime");}
			System.out.println("Enter a number: ");
			 num=scanner.nextInt();
		}
	}

}
