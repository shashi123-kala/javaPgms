package StringsPgm;

public class StringContainsDigit {

	public static void main(String[] args) {

		 String str = "a";
	      System.out.println("String: "+str);
	      if(str.matches("[0-9]+") && str.length() > 2) {
	         System.out.println("String contains only digits!");
	      } else {
	         System.out.println("String contains digits as well as other characters!");
	      }
	}

}
