package sample;

import java.util.GregorianCalendar;
import java.util.*;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub` 
		GregorianCalendar cal=new GregorianCalendar();
		System.out.println(cal.getTime());
		System.out.println("Today is "+ (cal.get(Calendar.MONTH)+1 + "/" + cal.get(Calendar.DATE)+"/"+cal.get(Calendar.YEAR)));
		//month starts from 0 ,so we need to add one
	}

}
