package ch13;
interface Shape{
	String col="Violet";
	void drawa();
}
class Rec implements Shape{
	public void drawa() {
		System.out.println(" _______");
		System.out.println("|       |");
		System.out.println("|_______|");

	}
}
public class ShTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Rec r=new Rec();
			System.out.println(r.col);
			r.drawa();
		}
	}

}
