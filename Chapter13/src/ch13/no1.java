package ch13;
import java.util.*;
class pet{
	String name;
	String type;
	public pet(String name,String type) {
		this.name=name;
		this.type=type;
	}
	public void showInfo() {
		System.out.println("The name is "+name);
		System.out.println("The type is"+type);
	}
}
class catty extends pet{
	char type='c';

	public catty(String name,String type){
	super(name,type);}
}
class dogy extends pet{
	char type='d';
	
	
	public dogy(String name,String type) {
		
		super(name,type);
	}
}
public class no1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		pet p;
		ArrayList <pet> pe=new ArrayList <pet>();
		do {
		System.out.println("Enter name for your pet or enter stop to exit :");
		String name=s.nextLine();
		if(name.equalsIgnoreCase("stop")) {
			break;
		}
		
		
		
		System.out.println("Enter type of pet(c for cat or d for dog)");
		String type=s.nextLine();
		if (type.equalsIgnoreCase("c")) {
			p=new catty(name,type);
			pe.add(p);
		}
		else if (type.equalsIgnoreCase("d")) {
			p=new dogy(name,type);
			pe.add(p);
		}
		else {
			System.out.println("not valid");
			continue;
		}
		
			
		}while(true);
	
	for(pet pets:pe) {
		System.out.println(pets.name+"\t"+pets.type);
	}
	}
		


}
