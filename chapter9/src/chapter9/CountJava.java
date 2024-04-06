package chapter9;
import java.util.*;
public class CountJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int javaCount = 0;
		String word;
		System.out.print("Enter sentence: ");
		do {
		word = scanner.next( );
		if (word.equalsIgnoreCase("STOP")) {
			break;
		} else if (word.equalsIgnoreCase("Java")){
			javaCount++;
		}
		}while(true);
		System.out.println("'Java' count: " + javaCount );

	}

}
