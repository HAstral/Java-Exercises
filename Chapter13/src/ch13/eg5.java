package ch13;
class tera{
	String color="White";
	void eat() {
		System.out.println("Animal is eating");
	}
}
class  tars extends tera{
	String color="black";
	public void printColor() {
		System.out.println(color);
		System.out.println(super.color);
		
	}
	void bark() {
		System.out.println("Dog is bark.");
	}
	public void showAction() {
		super.eat();
		bark();
	}
}
public class eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tars dog = new tars();
		dog.printColor();
		dog.showAction();
	
	}

}
