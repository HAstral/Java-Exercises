package chapter9;

public class justtesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer word1, word2;
		word1 = new StringBuffer("Lisa");
		word2 = word1;
		word2.insert(0, "Mona ");
		System.out.println(word1);

	}

}
