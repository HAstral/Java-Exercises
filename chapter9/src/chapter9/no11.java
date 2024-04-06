package chapter9;
import java.util.*;
public class no11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st;
		System.out.println("Enter string:");
		st=s.nextLine();
		int aco,eco,ico,oco,uco;
		aco=0;
		eco=0;
		ico=0;
		oco=0;
		uco=0;
		char c;
		for (int i=0;i<st.length();i++) {
			c=st.charAt(i);
			switch(c) {
			case 'a':  aco++; break;
			case 'e':  eco++;	break;
			case 'i':  ico++;	break;
			case 'o':  oco++;	break;
			case 'u':  uco++;	break;
			
			default: continue;
				
			}
			
	}
		System.out.println("# of 'a' : "+ aco);
		System.out.println("# of 'e' : "+ eco);
		System.out.println("# of 'i' : "+  ico);
		System.out.println("# of 'o' : "+ oco);
		System.out.println("# of 'u' : "+ uco);

}
}
