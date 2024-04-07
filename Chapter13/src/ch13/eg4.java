package ch13;
class Animal1{
	public void eat()
{
		System.out.println("Animal is eating");
		}

public void sleep() {
	System.out.println("Animal is sleeping");
}
}
class Dog extends Animal1{
	
	public void bark() {
		System.out.println("Dog is barking.");
	}
	
}
class Duck extends Animal1{
	public void skill() {
		System.out.println("Duck can swim");
	}
}
public class eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.eat();
		d.sleep();
		d.bark();
		Duck u=new Duck();
		u.eat();
		u.sleep();
		u.skill();
	}

}
