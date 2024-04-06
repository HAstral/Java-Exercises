package Samp;
import java.util.*;

class Num{
	private int a;
	public void isZero(int a) {
		if(a==0) {
			System.out.println("The answer is zero");
		}else
			System.out.println("The answer is nonzero");
	}
	private void isPositive(int a) {
		if (a>0) {
			System.out.println("The answer is positive");
		}else
			System.out.println("The answer is nonPositive");
	}
	private void isNegative(int a) {
		if (a<0) {
			System.out.println("The answer is nonNegative");
		}else
			System.out.println("The answer is Negative");
	}
	private void isOdd(int a) {
		if (a%2==1) {
			System.out.println("The answer is odd");
		}else
			System.out.println("The answer is not odd");
		
	}

	private void isEven(int a) {
		if (a%2==0) {
			System.out.println("The answer is even");
		}else
			System.out.println("The answer is not even");
		
	}
	
}
	public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
