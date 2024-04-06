package sample;

public class eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int num=10/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Executed ");
		}

	}

}
