package ch13;
import java.util.*;
class pet1{
	String name;
	String type;
	public pet1(String name,String type) {
		this.name=name;
		this.type=type;
	}
	public void showInfo() {
		System.out.println("The name is "+name);
		System.out.println("The type is"+type);
	}
}
class catty extends pet1{
	char type='c';

	public catty(String name,String type){
	super(name,type);}
}
class dogy extends pet1{
	char type='d';
	
	
	public dogy(String name,String type) {
		
		super(name,type);
	}
}
public class no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		pet1 p;
		ArrayList <pet1> pe=new ArrayList <pet1>();
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
		name=s.nextLine();
		type=s.nextLine();
		}while(true);
		Collections.sort(pe,(o1,o2)-> o1.type.charAt(0) - o2.type.charAt(0));
	for(pet1 pets:pe) {
		System.out.println(pets.name+"\t"+pets.type);
	}
	}
		


}
