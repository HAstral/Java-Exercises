package Samp;
import java.util.*;

class LotteryCard{
	private static final int MAX_NUMBER= 15;
	private static final int MIN_NUMBER= 10;
	private static final int NO_NUMBER= 0;
	private static final int MAX_COLOR= 3;
	private static final int MIN_COLOR= 1;
	private static final int NO_COLOR= 0;
	private int number;
	private int color;
	private Random random;
	public LotteryCard() {
		random=new Random();
		number= NO_NUMBER;
		color=NO_COLOR;
		
	}
	public void spin() {
		number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1)+ MIN_NUMBER;
		color = random.nextInt(MAX_COLOR - MIN_COLOR + 1)+ MIN_COLOR;
	}
	public int getNumber() {
		return number;
	}
	public int getColor() {
		return color;
	}
}
public class RoomWinner {
	public static void main(String[] args) {
	LotteryCard one,two,three;
	one=new LotteryCard();
	two=new LotteryCard();
	three=new LotteryCard();
	one.spin();
	two.spin();
	three.spin();
	System.out.println("Winning Card Combination: ");
	System.out.println(" 1 - red; 2 - green; 3 - blue");
	System.out.println(" ");
	System.out.println("   		color number");
	System.out.println("Card 1:	"+ one.getColor()+"	"+one.getNumber());
	System.out.println("Card 2:	"+ two.getColor()+"	"+two.getNumber());
	System.out.println("Card 3:	"+ three.getColor()+"	"+three.getNumber());
	}
}
	
	
	
	
	
	
	
		
	
	
	
	
	
