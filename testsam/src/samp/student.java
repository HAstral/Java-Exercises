package samp;
import java.util.*;

	

public class student {
	 String stuname;
		int stunum;
		double totalmark;
		public student(){
			stuname="student ";
			stunum=0;
			totalmark=0;
		}
		public  student(String name,int num,double mark)
		{
			this.stuname=name;
			this.stunum=num;
			this.totalmark=mark;
		}
		String grade;
		public void displayGrade() {
			if(totalmark>=80)
				grade="A";
			else if(totalmark>=65)
				grade="B";
			else if(totalmark>=50)
				grade="C";
			else if(totalmark>=35)
				grade="D";
			else
				grade="E";
	
		System.out.println("name:"+stuname+",number:"+stunum+",marks:"+totalmark+",grade:"+grade);
		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu=new student();
		stu.displayGrade();
		
		student sithu=new student("Sithu Naing",1,56);
		sithu.displayGrade();
		
		student palal=new student("Palal Phyu",2,66);
		palal.displayGrade();
	}

}
