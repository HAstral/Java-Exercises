package Chapter2;
import java.util.Scanner;



public class nu7 {
    public static void main(String[] args){
       
Scanner scanner=new Scanner(System.in);

    Double inch;
    Double centimetre=scanner.nextDouble();
    inch=centimetre/2.54;
        Double feet;

    feet=inch/12;
    System.out.println("Enter Centimeter :");
    System.out.println(inch+"in inches");
    System.out.println(feet+"in feet");

    }

    
}
