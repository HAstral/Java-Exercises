	package exercise;
	class Student  {
	    int rollNo;  
	    String name;
	  
	    Student() 
	   {
	        this(100, "Aye Aye");
	        System.out.println("Calling from default constructor"); 
	   }
	    Student(int rollNo)
	   {
	        this.rollNo = rollNo;
	    }  
	    Student(String name)  {
	        this.name = name;
	    }
	    Student(int rollNo, String name)  {
	         this.rollNo = rollNo;  
	         this.name = name;  
	    }  
	}

public class Constructorchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Student stud = new Student();
        System.out.println("Roll No. is " + stud.rollNo);
        System.out.println("Name is " + stud.name);

	}

}
