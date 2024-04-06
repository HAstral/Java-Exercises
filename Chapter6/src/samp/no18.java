package samp;
import java.util.*;
public class no18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num;
		System.out.println("Enter digits : ");
		num=s.nextInt();
		while(num>0) {
			int i=0;
			while(num>0) {
				num/=10;
				i++;
				
			}
			System.out.println("The number of digit is "+i);
			System.out.println("Enter digits : ");
			num=s.nextInt();
		}
	}

}
