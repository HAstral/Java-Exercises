package exercise;
class Employee
{
    int salary;
    String name;
    
    Employee(int sal, String empname)  {
         salary = sal;
         name = empname;
    }  
    public void passByValue(int sal) {
        System.out.println("Salary : " + sal);
        int increaseSalary = sal + 10000;
        System.out.println("Increase Salary : " + increaseSalary);
    } 
    public void passByReference(Employee emp) {
        System.out.println("Original Name " + emp.name);
        Employee e = emp;  
        e.name = "Min Min";
        System.out.println("Update Name : " + e.name);
    }
}

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empobj = new Employee(500, "Aung Aung");
        System.out.println(empobj.salary + " ," + empobj.name);

        empobj.passByValue(empobj.salary);
        System.out.println(empobj.salary);

        empobj.passByReference(empobj);
        System.out.println(empobj.name);

	}

}
