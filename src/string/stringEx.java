package string;

import java.util.Set;
import java.util.TreeSet;

public class stringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= new String("ganesha");
		String str2= new String("ganesha");
		System.out.println("printing String str1= new String()");	
		System.out.println("1==============");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
		
		System.out.println("2==============");
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
			
		System.out.println("3==============");
		
		StringBuffer str3= new StringBuffer("ganesha");
		StringBuffer str4= new StringBuffer("ganesha");
		System.out.println(str3==str4);//it checks reference
		System.out.println(str3.toString().equals(str4.toString()));//
		
		System.out.println("4==============");	
		
		String s ="amma";
		 s = s.concat("ddsf");
		 System.out.println(s);
		 
		 
			System.out.println("5==============");

		 str4= str4.append("DSFSDF");//string buffer appending
		System.out.println(str4);
		
		System.out.println("6==============");
		//to chk how string is immutable
		 String NewString1 = "Hello";    
	        NewString1.concat("World");  
	        System.out.println(NewString1); 
		
		String NewString = "Hello";    
        NewString = NewString.concat("World");  
        System.out.println(NewString);
        
        
        System.out.println(s+2+4+s);
        System.out.println(2+4);
        
       
        
        
       
        
          
	}

}
