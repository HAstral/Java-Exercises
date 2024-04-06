package Samp;
import java.util.*;

class Bicycle{
	private String ownerName;

	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String name) {
		ownerName= name;
	}
}

public class No10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bike1,bike2;
		String owner1,owner2;
		Scanner scanner=new Scanner(System.in);
		
		
		bike1=new Bicycle();
		
		bike2=new Bicycle();
		
		System.out.println("Enter owner1:");
		owner1=scanner.next();
		System.out.println("Enter owner2:");
		owner2=scanner.next();


		System.out.println(owner1+" owns a bike.");
		System.out.println(owner2+" also owns a bike.");
	}

}
