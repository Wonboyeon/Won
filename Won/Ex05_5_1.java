package Won;

public class Ex05_5_1 {
	public static void main(String[] args) {
		int sum = 1;
		int i = 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
			sum *= i;
		}
		System.out.print(sum);
	}
}
