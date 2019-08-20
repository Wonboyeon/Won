package Won;

public class Ex05_2 {
	public static void main(String[] args) {
		int n1 = 50;
		int n2 = 100;
		int big;
		int diff;
		
		if(n1 > n2) 
			big = n1;
		else 
			big = n2;
			System.out.println(big);
		if(n1 > n2)
			diff = n1 - n2;
		else
			diff = n2 - n1;
		System.out.println(diff);
	}
}
