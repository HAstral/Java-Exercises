package chapter9;
import java.util.*;

import java.util.regex.*;
class MatchJavaIdentifierPM {

	private static final String STOP="Stop";
	private static final String VALID="Valid Java Identifier";
	private static final String Invalid="Not a valid java Identifier";
	private static final String Valid_Identifier_Pattern="[a-zA-Z][a-zA-Z0-9_$]*";
	Scanner scan=new Scanner(System.in);
	String str, reply;
	Matcher mat;
	Pattern pat=Pattern.compile(Valid_Identifier_Pattern);
	while(true) {
		System.out.print("Identifier:");
		str=scan.next();
		if(str.equals(STOP))break;
		mat=pat.matcher(str);
		if(mat.matches()) {
			reply=VALID;
			
		}else {
			reply=Invalid;
		}
	System.out.println(str+": "+reply+"\n");
	}

}
}
