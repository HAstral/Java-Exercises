package ch13;

abstract class Student1{
	protected int NUM_OF_TESTS=3;
	protected String name;
	protected int [] test=new int[NUM_OF_TESTS];
	protected String courseGrade;
	public Student1(String studentName) {
		name       = studentName;
				}
		abstract public String computeCourseGrade();

public String getCourseGrade() {
return courseGrade;
}
public String getName() {
return name;


}
public int getTestScore(int testNumber) {
return test[testNumber];


}

public void setName(String newName) {
name = newName;






}
public void setTestScore(int testNumber,int testScore)
{
	test[testNumber] = testScore;
}
	
}
class underGraduateStudent extends Student1{
	public underGraduateStudent(String studentName) {
		super(studentName);
		// TODO Auto-generated constructor stub
	}

	public String computeCourseGrade() {

int total = 0;
for (int i = 0; i < NUM_OF_TESTS; i++) {
total += getTestScore(i);



if (total/NUM_OF_TESTS >= 70) {
courseGrade = "Pass";
} else {
courseGrade = "No Pass";
}}
return courseGrade;
	}
	
}
class graduateStudent extends Student1{
	public graduateStudent(String studentName) {
		super(studentName);
		// TODO Auto-generated constructor stub
	}

	public String computeCourseGrade() {

		int total = 0;
		for (int i = 0; i < NUM_OF_TESTS; i++) {
		total += getTestScore(i);


		
		if (total/NUM_OF_TESTS >= 80) {
		courseGrade = "Pass";
		} else {
		courseGrade = "No Pass";
		}}
return courseGrade;
		
			}
}
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 st1=new underGraduateStudent("Mr.bo");
		st1.setTestScore(1, 60);
		st1.setTestScore(2, 70);
		st1.setTestScore(0, 80);
		Student1 st2=new graduateStudent("Mr.ko");
		st2.setTestScore(1, 60);
		st2.setTestScore(2, 70);
		st2.setTestScore(0, 80);
		 System.out.println("Student 1 - Name: " + st1.getName() + ", Course Grade: " + st1.computeCourseGrade());
	        System.out.println("Student 2 - Name: " + st2.getName() + ", Course Grade: " + st2.computeCourseGrade());
	}

}
