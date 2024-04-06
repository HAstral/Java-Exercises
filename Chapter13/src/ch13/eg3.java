package ch13;
class Animal{
	public void eat()
{
		System.out.println("Animal is eating");
		}

public void sleep() {
	System.out.println("Animal is sleeping");
}
}
class Dog extends Animal{
	
	public void bark() {
		System.out.println("Dog is barking.");
	}
	
}
class GunDog extends Dog{
	public void skill() {
		System.out.println("Gun Dog has hunting skill");
	}
}
public class eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GunDog g=new GunDog();
		g.eat();
		g.sleep();
		g.bark();
		g.skill();
	}

}
