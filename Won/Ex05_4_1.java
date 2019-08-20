package Won;

public class Ex05_4_1 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0 ;
		
		while(num < 100) {
			System.out.println(num);
			sum += num;
			num++;
		}
		System.out.println(sum);
	}
}
