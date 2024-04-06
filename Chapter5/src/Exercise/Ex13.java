package Exercise;
import java.util.*;
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter The number of hours you have worked: ");
		double time=scanner.nextDouble();
		double wages=0;
		double commision=0;
		if(time<=8)
		{
			wages+=7.25*time;
		}
		else
		{
			wages+=(7.25*8)+((7.25 + 7.25/2)*(time-8));
		}
		System.out.print("Enter your total sales:");
		double sales=scanner.nextDouble();
		if(sales>=1 && sales<=99.99)
		{
			commision=sales* 5/100;
		}
		else if(sales>=100 && sales<=299.99)
		{
			commision=sales* 10/100;
		}
		else if(sales>=300)
		{
			commision=sales* 15/100;
		}
		wages+=commision;
		System.out.println("The wage is "+ wages);

	}

}
