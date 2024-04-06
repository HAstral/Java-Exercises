package Samp;

import java.util.*;

 class Die {
	private static final int MAX_NUMBER = 6;
	private static final int MIN_NUMBER = 1;
	private static final int NO_NUMBER = 0;
	private int number;
	private Random random;
	public Die() {
		random=new Random();
		number=NO_NUMBER;
	}
	public void roll() {
		number= random.nextInt(MAX_NUMBER - MIN_NUMBER + 1)+ MIN_NUMBER;
	}
	public int getNumber() {
		return number;
	}
}

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die one,two,three;
		one = new Die();
		two = new Die();
		three = new Die();
		one.roll();
		two.roll();
		three.roll();
		System.out.println("Result are " + one.getNumber()+" "+two.getNumber()+" "+three.getNumber());
	}

}
