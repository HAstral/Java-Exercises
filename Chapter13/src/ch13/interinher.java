package ch13;
interface Veh{
	void drive();
}
interface Ca extends Veh{
	void hasSeat();
}
class Mcs implements Ca{
	public void drive() {
		System.out.println("Driving....");
	}
	public void hasSeat() {
		System.out.println("4 Seats");
	}
}
public class interinher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mcs mine=new Mcs();
		mine.drive();
		mine.hasSeat();
	}

}
