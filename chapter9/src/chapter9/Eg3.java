package chapter9;

public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java Programming";
		System.out.println("character = " +s1.charAt(3));
		System.out.println("length = " +s1.length());
		
		String s2="welcome";
		System.out.println(s2.substring(2, 5));
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(0));

		String s3="Are you studying?";
		System.out.println(s3.contains("Are you"));
		System.out.println(s3.contains("study"));
		System.out.println(s3.contains("going"));

		System.out.println(s3.isEmpty());
		
		String s5="Object Oriented ";
		s5.concat("Programming");
		System.out.println(s5);
		s5=s5.concat("Programming");
		System.out.println(s5);

		String str1="Object";
		String str2=" Oriented";
		String str3=" Programming";
		String str4=str1.concat(str2).concat(str3);
		System.out.println(str4);

		String s6="Java programming";
		String s=s6.replace('a', 'A');	
		System.out.println(s);
		String s7="I am Su Su. I am reading";
		String ss=s7.replace("am", "was");
		System.out.println(ss);
		
		String s8="Java";
		String s9="JAVA";
		System.out.println(s8.equalsIgnoreCase(s9));
		System.out.println(s8.equals(s9));

		String s81="Java Programming";
		System.out.println(s81.replaceAll("a", "b"));

		String s13="My .com is java.com";
		String s14=s13.replaceAll(".com", ".net");
		System.out.println(s14);                  

		String s11="University of Computer Studies , Yangon";
		String s12=s11.replaceAll("(.*)Computer(.*)", "Computer University");
		System.out.println(s12);  	
		String s131= "University of Computer Studies, Yangon : Computer Science"; 
		System.out.println(s131.indexOf('o'));   //11
		System.out.println(s131.indexOf('o', 12));  //15
		System.out.println(s131.indexOf("Computer"));  //14
		System.out.println(s131.indexOf("Computer", 20));  //41


		System.out.println(s131.lastIndexOf('i')); //52
		System.out.println(s131.lastIndexOf('i',50));//27
		
		String st="      Java Programming";
		System.out.println(st.trim());
		//delete space in front of Java

		String s4="JAVA PROGRAMMINg";
		System.out.println(s4.toLowerCase());
		 System.out.println(s4.toUpperCase());

		 int value=10; char ch='A';
					boolean flag=true; float f  = 10.05f;     double d = 10.02;  
				     System.out.println(String.valueOf(value));
				     System.out.println(String.valueOf(ch));
				     System.out.println(String.valueOf(flag));
				     System.out.println(String.valueOf(f));
				     System.out.println(String.valueOf(d));
				     String st1="java string example";  
				     System.out.println(st1.startsWith("ja")); 
				     System.out.println(st1.startsWith("java string")); 
				     System.out.println(st1.endsWith("le")); 
				     System.out.println(st1.endsWith("exam")); 
				     String stri1="java";
				     String stri2="programming";
				     String stri3="java";
				     System.out.println(stri1.compareTo(stri3));
				      System.out.println(stri1.compareTo(stri2));
				      System.out.println(stri2.compareTo(stri1));
				    System.out.println(stri1.length());
				    System.out.println(stri2.length());
				    
				    StringBuffer stri=new StringBuffer("Good");
				    stri.append(" Morning");
				    System.out.println(stri);

				    StringBuilder str=new StringBuilder("Welcome");
				    str.append(" UCSY");
				    System.out.println(str);



	}

}
