package chapter9;



	public class stringeg {
		 public static void concat1(String s1)
		    {
		        s1+=(" of Computer Studies");
		    }

		    public static void concat2(StringBuilder s2)
		    {
		        s2.append(" of Computer Studies");
		    }

		    public static void concat3(StringBuffer s3)
		    {
		        s3.append(" of Computer Studies");
		    }
		    public static void main(String[] args)
		    {
		    String s1 = "University";
		        concat1(s1); 
		        System.out.println("String: " + s1); 

		        StringBuilder s2 = new StringBuilder("University");
		        concat2(s2); 
		        System.out.println("StringBuilder: " + s2);
		 
		        StringBuffer s3 = new StringBuffer("University");
		        concat3(s3); 
		        System.out.println("StringBuffer: " + s3);
		    }


	}
