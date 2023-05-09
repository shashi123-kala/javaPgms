package string;

public class NoOfwordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am god ganesha";
		String trim = s.trim();
		if (!trim.isEmpty())
		    System.out.println( trim.split("\\s+").length);;
		    
		    
		    //method 2
		    int count = 0;
		    String array[]= s.split(" ");
		    for(int i=0;i<array.length; i++) {
		    	if(array[i]!=" ")
		    		count++;
		    }
		    System.out.println(count);
		    

	}

}
