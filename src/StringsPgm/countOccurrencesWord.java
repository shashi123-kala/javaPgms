package StringsPgm;

public class countOccurrencesWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GeeksforGeeks A computer science portal for geeks portal ";
	    String word = "portal";
	    String a[] = str.split(" ");
	    
	    // search for pattern in a
	    int count = 0;
	    for (int i = 0; i < a.length; i++)
	    {
	    // if match found increase count
	    if (word.equals(a[i]))
	        count++;
	    }
	 
	    System.out.println(count);
	    
	    
	    
	    //method 2
	    

	}

}
