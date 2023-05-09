package arrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "09876";
		//String str = "rock";
		char arr[] = str.toCharArray();
				char temp;
				
				for(int i=0; i<arr.length; i++) {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]>arr[j]) {
							temp = arr[i];
							arr[i]= arr[j];
							arr[j]=temp;
						}
						
					}
				}
				System.out.println(arr);

	}

}
