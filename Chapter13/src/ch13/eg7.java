package ch13;

public class eg7 {
void sum(int a,int b) {
	int c=a+b;
	System.out.println("Addition of two num "+c);
}
void sum(int a,int b, int c) {
	int d=a+b+c;
	System.out.println("Addition of three num "+d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eg7 ob=new eg7();
		ob.sum(10, 11);
		ob.sum(13, 32, 33);
	}

}
