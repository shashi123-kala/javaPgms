package collections;

public class countNoOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name= "my name is god ganesha";
		int count = 0;    
        
        //Counts each character except space    
        for(int i = 0; i < name.length(); i++) {    
            if(name.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
		}
	

}
