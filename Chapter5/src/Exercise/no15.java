package Exercise;
class Triangle{
	public static final int INVALID_DIMENSION=-1;
	private int a,b,c;
	public Triangle(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	private boolean isValid(){
		return a+b>c && a+c>b && b+c>a;
	}
	public int getArea() {
		if(!isValid()) {
			return INVALID_DIMENSION;
		}
		int s=(a+b+c)/2;
		int res=s*(s-a)*(s-b)*(s-c);
		int A=(int) Math.sqrt(res);
		return A;
	}
	public int getPerimeter() {
		if(!isValid()) {
			return INVALID_DIMENSION;
		}
		return a+b+c;
	}
}
public class no15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri=new Triangle(4,5,6);
		int area=tri.getArea();
		int peri=tri.getPerimeter();
		if(peri==tri.INVALID_DIMENSION) {
			System.out.println("invalid");
		}
		else {
			System.out.println("Perimeter is "+ peri);
		}
		
		if(area==tri.INVALID_DIMENSION) {
			System.out.println("Invalid");
		}
		else {
			System.out.println("Area is "+area);
		}
		
	}

}
