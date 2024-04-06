package chapter9;
import java.util.*;
import java.util.regex.*;
public class javarex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Pattern p=Pattern.compile(".b");
     Matcher m=p.matcher("ab");
     boolean result=m.matches();
     System.out.println(result);
     boolean res2=Pattern.compile(".b").matcher("ab").matches();
     System.out.println(res2);
     boolean res1=Pattern.matches(".b","ab");
     System.out.println(res1);
     
     String text3="redisyellowIsgreenisblue";
     Pattern p1=Pattern.compile("is", Pattern.CASE_INSENSITIVE);    
     String [] result1=p1.split(text3);
     for(String s: result1)
     {
     	System.out.print(s);

	}
     String text4="AABBCAAADEEAA";
     Pattern p2=Pattern.compile("AA");
     Matcher m2=p2.matcher(text4);
     while(m2.find())
     {
     System.out.println("Found at : "+m2.start()+" - "+m2.end());
     }
     Pattern p3=Pattern.compile("\\s+");
     Matcher m3=p3.matcher("This   is my first  time");
     String newString=m3.replaceAll(" ");
     System.out.println("New String ="+newString);

     StringTokenizer st = new StringTokenizer("University of Computer Studies"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken()); 
} 

	}
}
