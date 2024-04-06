package sample;
import java.io.*;
import java.util.InputMismatchException;
public class mulex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int array[]=new int[5];    
			array[3]=20/0;
		}
		catch(ArithmeticException e1)
		{     System.out.println(e1);  }
		catch(ArrayIndexOutOfBoundsException e2)
		{    System.out.println(e2); }
		catch( InputMismatchException e)
		{ 
		       System.out.println(e);
		       System.out.println("Other Exception");
		}
		System.out.println("MultipleCatchExample");

	}

}
