package sample;
import java.io.*;
public class chexce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openfile("content.txt");
	}
	public static void openfile(String filename) {
		try {
			FileInputStream f=new FileInputStream(filename);
		
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("File not found.");
	}

}
