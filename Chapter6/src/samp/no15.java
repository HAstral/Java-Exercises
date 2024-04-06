package samp;
import java.util.*;
public class no15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scn.nextInt();
		do
		{
			int div=1;
			int sum=0;
			while(num>div)
			{
				if(num%div==0) {
					sum+=div;
				}
				div++;
			}
			if(sum==num)
			{
				System.out.println(num+" is perfect num.");
			}
			else
			{
				System.out.println(num+" is not perfect num.");
			}
			System.out.println("Enter a number:");
			 num=scn.nextInt();
		}while(num>0);

	}

}
