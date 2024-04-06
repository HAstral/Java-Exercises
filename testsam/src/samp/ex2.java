package samp;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i,j;
//		float x,y;
//		double u,v;
//		i=x;
//		x=u+y;
//		x=23.4+j *y;
//		v=(int) x;
//		y=j/i*x;
//		
		try{
			int arr[]= {10,20,30}; 
			System.out.println(arr[3]);
			}
			catch(ArithmeticException e1)
			{ 
			System.out.println("Arithmetic Exception");
			}
			catch(ArrayIndexOutOfBoundsException e2)
			{ 
			System.out.println("ArrayIndexOutOfBounds Exception"); 
			}
			finally {
			System.out.println("This clause is executed");
			}
	}

}
