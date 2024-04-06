package Exercise;
import java.util.*;

public class ex9 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter power of ten: ");
		int power=scanner.nextInt();
		switch(power) {
		case 6: System.out.print("Million");
		break;
		
		case 9: System.out.print("Billion");
		break;
		
		case 12: System.out.print("Trillion");
		break;
		
		case 15: System.out.print("Quadrillion");
		break;
		
		case 18: System.out.print("Quintillion");
		break;
		
		case 21: System.out.print("Sextillion");
		break;
		
		case 24: System.out.print("Nonillion");
		break;
		
		case 27: System.out.print("Googol");
		break;
		
		default: System.out.print("Invalid");
		break;
		}
	}
}
