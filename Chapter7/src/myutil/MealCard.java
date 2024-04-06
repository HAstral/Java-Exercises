package myutil;

public class MealCard {

	
		// TODO Auto-generated method stub
		private int balan;
		private String stuN;
		public MealCard(String stuN){
			this.stuN=stuN;
			this.balan=100;
	}
		public MealCard(String stuN,int bal) {
			this.stuN=stuN;
			this.balan=bal;
		}
		public void addpoints(int poi){
			balan+=poi;
			System.out.println("Your point is now "+balan);
		}
		public void buyFood(int fpo) {
			if (balan>=fpo) {
				balan-=fpo;
				System.out.println("Your food is purchased and your balanced is now "+balan);
			}
			else {
				balan=balan;
				System.out.println("Insufficent points and your points are "+balan);
				
			}
		}
		public int getBal() {
			return this.balan;
		}
		public String getName() {
			return this.stuN;
		}
	}


