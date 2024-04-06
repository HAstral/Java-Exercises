package Exercise;
import java.util.*;

public class Exe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=scanner.nextInt();
		System.out.print("Enter your height: ");
		int height=scanner.nextInt();
		if(height>140 && height<230)
			System.out.print("compute the recommended weight");
		else
			System.out.print("error");
		}

}
