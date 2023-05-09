package arrays;

public class factorialNummber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(factorial(6));
	}

	private static int factorial(int number) {
		// TODO Auto-generated method stub
		if(number==0)
		return 1;
		else{
			return number * factorial(number -1);
			
		}
	}

}
