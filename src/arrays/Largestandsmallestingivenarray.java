package arrays;

public class Largestandsmallestingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intarray[] = new int[]{10,20,98,40,50};
		int largest = Integer.MIN_VALUE;
		int smalest =Integer.MAX_VALUE;
		for(int no: intarray){
			if(no > largest){
			largest = no;
			}
		}
		for(int no: intarray){
			if(no < smalest){
			smalest = no;
			}
		}
		System.out.println(largest);
		System.out.println(smalest);
		
		
		//method 2
		int arr[] = {12, 13, 1, 10, 34, 10};

	       int largest1 = arr[0], smallest=arr[0];

	       for(int i=0; i<arr.length; i++) { 
	    	   if(smallest > arr[i])
	              smallest = arr[i];
	           if(largest1 < arr[i])
	              largest1 = arr[i];

	       }

	       System.out.println(smallest);
	       System.out.println(largest1);

	}

}
