package samp;
import java.util.*;
public class no17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int low=100,high=1000;
			for (int i=low+1;i<high;i++)
			{
				int sum=0;
				int a=i;
				while(a>0)
				{
					int dig=a%10;
					sum+=Math.pow(dig, 3);
					a=a/10;
				}
				if(sum==i)
				{
					System.out.println(i+", ");
				}
			}
	
		
	}

}
