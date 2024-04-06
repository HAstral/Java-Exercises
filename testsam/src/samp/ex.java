package samp;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int sum=0;
// 	for (int i=0;i<=10;i++) {
// 		for (int j=10;j>i*2;j--) {
// 			sum=sum+(j-i);
 int j=0;
 do {
	 j++;
	 for (int i=5;i>j;i--) {
		 sum=sum+(i+j);
 		}
 	}while(j<11);
 	System.out.println(sum);
	}

}
