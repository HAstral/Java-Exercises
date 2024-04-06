package chapter9;
import java.util.*;
public class ReplaceVowelsWithX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		StringBuffer tempStringBuffer;
		String inSentence;
		char letter;
		System.out.println("Sentence: ");
		inSentence = scanner.next();
		tempStringBuffer = new StringBuffer(inSentence);
		for (int index = 0; index < tempStringBuffer.length(); index++) {
			letter = tempStringBuffer.charAt(index);
			if (letter == 'a' || letter == 'A' ||
			letter == 'e' || letter == 'E' ||
			letter == 'i' || letter == 'I' ||
			letter == 'o' || letter == 'O' ||
			letter == 'u' || letter == 'U' ) {
			tempStringBuffer.setCharAt(index,'X');
			}
			}
			System.out.println("Input: " + inSentence);
			System.out.println("Output: " + tempStringBuffer);

	}

}
