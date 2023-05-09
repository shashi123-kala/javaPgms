package StringsPgm;
public class stringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= new String("ganesha");
		String str2= new String("ganesha");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		StringBuffer str3= new StringBuffer("ganesha");
		StringBuffer str4= new StringBuffer("ganesha");
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		String s ="amma";
		 s = s.concat("ddsf");
		 str4= str4.append("DSFSDF");
		System.out.println(s);
		System.out.println(str4);
		
		
		//to chk how string is immutable
		 String NewString1 = "Hello";    
	        NewString1.concat("World");  
	        System.out.println(NewString1); 
		
		String NewString = "Hello";    
        NewString = NewString.concat("World");  
        System.out.println(NewString);
        
          
	}

}
