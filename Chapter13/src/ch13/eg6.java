package ch13;
class tarap{
	tarap(){
		System.out.println("Animal is created");
	}
}
class Woof extends tarap{
	Woof(){
		super();
		System.out.println("Dog is created");
	}
}
public class eg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woof wu=new Woof();
	}

}
