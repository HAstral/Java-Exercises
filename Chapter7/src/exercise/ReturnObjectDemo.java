package exercise;
 class Sample
{
    private int value;
 
    public Sample(int num)
   {
       value = num;
    }

   public Sample makeTwice()
   {    
        Sample obj = new Sample(value*2);
        return obj;
    }
   public void show()
   {
        System.out.println("Value = " + value);
   }
}
public class ReturnObjectDemo {


	    public static void main(String[] args) {
	          Sample obj1 = new Sample(10);
	          obj1.show();

	          Sample obj2;
	          obj2 = obj1.makeTwice();
	          obj2.show();
	}

}
