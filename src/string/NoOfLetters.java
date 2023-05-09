package string;

import java.util.HashMap;
import java.util.Map;

public class NoOfLetters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeks for geeks"; 
        char[] ch = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) { 
            String s = ""; 
            while (i < ch.length && ch[i] != ' ') { 
                s = s + ch[i]; 
                i++; 
            } 
  
            if (s.length() > 0)  
                System.out.println(s + "->" + s.length());             
        } 
    
        
       


	}

}
