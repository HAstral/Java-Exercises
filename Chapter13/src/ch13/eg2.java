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

public class eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.eat();
		d.sleep();
		d.bark();
	}

}
