package Java8Pgms;

interface interf{
public void add(int a , int b);
}


public class lambdaPgm {
	public static void main(String[] args) {
		interf i = (a,b)->  System.out.println("adding" +(a+b)) ;
		i.add(10,20);
	}

}
