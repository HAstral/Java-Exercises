package Samp;
import java.util.*;

class WeightConventer{
	int weight;
	
	public double convert(int weight,double gravity) {
		double res=weight*gravity;
		return res;
	}
	
};
public class no14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeightConventer moonWeight,mercuryWeight,venusWeight,jupiterWeight,saturnWeight;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your weight:");
		int weight=sc.nextInt();
		
		mercuryWeight=new WeightConventer();
		double yourMercuryWeight=mercuryWeight.convert(weight, 0.4);
		System.out.println("Your weight on mercury is"+yourMercuryWeight);
		
		moonWeight=new WeightConventer();
		double yourMoonWeight=moonWeight.convert(weight, 0.167);
		System.out.println("Your weight on moon is"+yourMoonWeight);
		
		venusWeight=new WeightConventer();
		double yourVenusWeight=venusWeight.convert(weight, 0.9);
		System.out.println("Your weight on venus is"+yourVenusWeight);
		
		jupiterWeight=new WeightConventer();
		double yourJupiterWeight=jupiterWeight.convert(weight, 2.5);
		System.out.println("Your weight on Jupiter is"+yourJupiterWeight);
		
		saturnWeight=new WeightConventer();
		double yourSaturnWeight=saturnWeight.convert(weight, 1.1);
		System.out.println("Your weight on Saturn is"+yourSaturnWeight);
		}

}
