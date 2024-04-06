package Samp;
import java.util.*;

 class Height{
	public int age;
	
	public int height;
	public double recommendedWeight(int age,int height) {
		double rewei=(height-100 + (age/10))*0.9;
		return rewei;
	}
	
	
}

public class No12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Height P1 =new Height();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter people1 age:");
		P1.age=sc.nextInt();
		System.out.println("Enter p1 height:");
		P1.height=sc.nextInt();
		
		double result=P1.recommendedWeight(P1.age, P1.height);
		System.out.println("The recommended weight is :"+result+"kg");
	}

}
