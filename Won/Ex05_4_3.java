package Won;

public class Ex05_4_3 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		while(num <= 1000) {
			if(num%2 == 0 && num%7 == 0) {
				System.out.println(num);
				sum += num;
			}
			num ++;
		}
		System.out.println(sum);
	}
}
