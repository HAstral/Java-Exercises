package ch13;
class Abba{
	public void eat() {
		System.out.println("Animal eat");
	}
}
class Cows extends Abba{
	public void eat() {
		System.out.println("Cows eat plants");
	}
}
class Raccons extends Abba{
	public void eat() {
		System.out.println("Raccons eats plants and meat");
	}
}
class Tigers extends Abba{
	public void eat() {
		System.out.println("Tigers eat meat");
	}
}
public class eg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abba a=new Abba();
		Abba b=new Cows();
		Abba c=new Raccons();
		Abba d=new Tigers();
		
		a.eat();
		b.eat();
		c.eat();
		d.eat();
	}

}
