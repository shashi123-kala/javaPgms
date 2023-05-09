package string;

public class reverseOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="java code shashhi kala";
		String array[] = str.split(" ");
		String reverseWord = "";
		for(String word:array) {
			String revWord= "";
			for(int i=word.length()-1; i>=0; i-- ) {
				revWord =revWord+ word.charAt(i);
			}
			reverseWord = reverseWord + revWord	+ " ";
		}
		
		
		System.out.println(reverseWord);
		
	}

}
