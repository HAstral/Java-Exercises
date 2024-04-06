package samp;

abstract class Shape{
	String color;
	abstract void computeArea();
}
class Triangle extends Shape{
	int base,height;
	String color;
	public Triangle(String col,int base,int height) {
		this.color=col;
		this.base=base;
		this.height=height;
	}
	
	@Override
	void computeArea() {
		int area=(base+height)/2;
		System.out.println("The area of Triangle is "+area+" and the color is "+color);
	}
	
	
}
class Circle extends Shape{
	int radius;
	String color;
	public Circle(String col,int r) {
		this.color=col;
		this.radius=r;
	}
	
	@Override
	void computeArea() {
		double area=radius*radius*3.142;
		System.out.println("The area of Circle is "+area+" and the color is "+color);
	}

	
	
	
}
public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle("red",10,10);
		Circle c=new Circle("blue",10);
		t.computeArea();
		c.computeArea();
	}

}
