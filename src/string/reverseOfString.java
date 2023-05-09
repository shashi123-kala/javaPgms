package string;

public class reverseOfString {

	public static void main(String[] args) {
	String str= "Geeks", nstr="";
    char ch;
    
  System.out.print("Original word: ");
  System.out.println("Geeks"); //Example word
   
  for (int i=0; i<str.length(); i++)
  {
    ch= str.charAt(i); //extracts each character
    nstr= ch+nstr; //adds each character in front of the existing string
  }
  System.out.println("Reversed word: "+ nstr);
  
  
//2nd method
	String s = "hello",reverse =" ";
	char [] array = s.toCharArray();
	for(int i =array.length-1;i>=0;i--) {
		System.out.println(array[i]);
	}
	
	System.out.println("");
	//3rd method
	for(int i =s.length()-1; i>=0; i--)
		System.out.println(s.charAt(i));
	
	
	//palindromw
	String p = "madam";
	for(int i=p.length()-1; i>=0; i-- )
		reverse = reverse + p.charAt(i);
	
	System.out.println("reversded"+reverse.trim());
	System.out.println("given string"+p);
	
	if(reverse.equals(p))
		System.out.println("its palindrome");
	else
		System.out.println("its not");
	
	
	
	
	//remove special character in a string
	String splString = "gane@#$s&*(sha";
	String plainString =  splString.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(plainString);
			
}
	
	
	
	

}
