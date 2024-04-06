package samp;
import java.util.*;
public class no13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number greater than 2:");
		int num=scn.nextInt();
		while(num>2)
		{
			Date starttime=new Date();
			int count=0;
			
			for(int j=2;j<=num;j++) {
				int i=2;
				while(j%i!=0)
				{	i++;
				}
				if(i==j)
				{
					count++;
				}
			}
			Date endtime=new Date();
			double excetime=endtime.getTime()-starttime.getTime();
			System.out.println("total time:"+excetime/100+" s");
			System.out.println("prime number between 2 and "+num+": "+count);
			System.out.println("Enter a number greater than 2:");
			num=scn.nextInt();
	}

}
}