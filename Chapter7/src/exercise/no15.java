package exercise;
import myutil.MealCard;
public class no15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealCard cardA=new MealCard("Mg Uzi",200);
		MealCard cb=new MealCard("Mg Shotgun");
		cb.addpoints(99);
		cardA.buyFood(50);
		cardA.getName();
		cb.getBal();
		cb.buyFood(200);
		cb.getBal();
	}

}
