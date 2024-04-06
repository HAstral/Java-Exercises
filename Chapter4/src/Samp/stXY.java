package Samp;
import java.util.*;
class Point{
	private int x,y;
	private int number;
	public void setX(int a) {
		x=a;
	}
	public void setY(int b) {
		y=b;
	}
	public void setXY(int a,int b) {
		x=a;
		y=b;
	}
	//Constructor
	public Point() {
	
	}
	public Point(int a,int b) {
		x=a;
		y=b;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getXY() {
		return x+y;
	}
}
public class stXY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point();
		point.setX(120);
		point.setY(100);
		System.out.println(point.getX());
		System.out.println(point.getY());
		System.out.println(point.getXY());
	}

}
