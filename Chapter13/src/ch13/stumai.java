package ch13;
class Student  
{
    private String name;
    private String address;

    public String getName() {
         return name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}

public class stumai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setName("Sein Aye");
		s.setAddress("Min Hla");
		System.out.println(s.getName());
		System.out.println(s.getAddress());
	}

}
