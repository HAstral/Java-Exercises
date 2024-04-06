package sample;

public class eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Nested Try Example ");
			try
			{     int num=10/0;       }
			catch(ArithmeticException e1)
			{    System.out.println(e1); }
			try
			{	
			String str="";
		System.out.println(str.charAt(8));
			}
			catch(StringIndexOutOfBoundsException e2)
			{   System.out.println(e2);  }

				String st=null;
				System.out.println(st.length());
				}
			catch(NullPointerException e)
			{   
			 System.out.println(e);  
			}

			}

	

}
