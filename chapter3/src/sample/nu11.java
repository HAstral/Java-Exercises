package sample;
import java.util.*;
import java.lang.*;
import java.time.*;
import java.text.*;

public class nu11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year you are born:");
		Integer year=scanner.nextInt();
		Year tyear=Year.now();
		Integer thisyear=tyear.getValue();
		Integer age=thisyear - year;
		System.out.println("You were born in "+ year + " will be "+age+" this year.");
		
	}

}
