package samp;
import java.util.*;
public class format {
	public static void main(String []args){
	Formatter fo=new Formatter(System.out);
	int n=654;
	int n1=4,n2=3;
	int n3=n1+n2;
	fo.format("%1d + %3d = %3d", n1,n2,n3);
	System.out.format("\n%6d",n);
	fo.format("\n%15.3f", 345.9867);
	String name = "John"; 
	fo.format("\nHello, %s. Nice to meet you.", name);

	fo.close();
	
}
}