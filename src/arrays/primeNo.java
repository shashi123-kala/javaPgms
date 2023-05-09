package arrays;

public class primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isItPrime = true;
		int inputNumber = 18;
		 
		if(inputNumber <= 1) 
		{
		isItPrime = false;
		 
		}
		else
		{
		for (int i = 2; i<= inputNumber/2; i++) 
		{
		if ((inputNumber % i) == 0)
		{
		isItPrime = false;
		 
		break;
		}
			
	}

}
		if(isItPrime)
		System.out.println("its a prime");
		else
			System.out.println("its not a prime");
	}}
