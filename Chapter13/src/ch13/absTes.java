package ch13;
abstract class Ani{
	abstract void speak();
	void sleep() {
		System.out.println("Sleeping");
	}
}
class Dogo extends Ani{
	@Override
	void speak() {
		System.out.println("Woof woof");
	}
}
class Ducky extends Ani{
	@Override
	void speak() {
		System.out.println("Quack Quack");
	}
}
public class absTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogo d=new Dogo();
		d.sleep();
		d.speak();
		
		Ducky y=new Ducky();
		y.speak();
	}

}
