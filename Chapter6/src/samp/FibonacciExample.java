package samp;
import java.util.*;
public class FibonacciExample {
public static void main(String[] args) {
int n1 = 1;
int n2 = 1;
int n3 = 0;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter N numbers in the Fibonacci sequence: ");
int N = scanner.nextInt();
System.out.println("Fibonacci Sequence is : ");
System.out.print(n1 +" "+ n2); 
 
for(int i=2; i<N; i++) 
{ 
n3 = n1 + n2; 
System.out.print(" " + n3); 
n1 = n2; 
n2 = n3; 
} 
//System.out.println("The ans is "+n3);
}
}