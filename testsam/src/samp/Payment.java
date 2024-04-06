package samp;
import java.util.*;
import java
public class Payment {
	Payment(String employee_name,int worked_hours)
	{
		String name=employee_name;
		System.out.print(" ");
		int hour=worked_hours;
		System.out.print(" ");
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double hourlywage=8.25;
		int worked_hours;
		
		System.out.print("enter employee name:");
		String employee_name=scanner.toString();
		System.out.print("Enter worked hours:");
		int hours=scanner.nextInt();
		public static double calculatePayment(int hours,double twage){
		if (hours<=40)
		{
			twage=8.25*hours;
			
		}else
		{
			twage=(8.25*50)+((8.25+8.25/2)*(hours-40));
			
		}
		return twage;
		};
		double total_wage=caculatePayment(hours,twage);
	}

}
