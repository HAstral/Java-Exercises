package samp;

public class no6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=10;i<60;i++) {
			if(i%10 == 9) {
				System.out.println(" "+i);
				continue;
			}
			else {
				System.out.print(" "+i);
			}
		}
	}

}
