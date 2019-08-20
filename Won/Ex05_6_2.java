package Won;

public class Ex05_6_2 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(true) {
			if(num%2 != 0) {
				sum += num;
			}
			if(sum > 1000) {
				System.out.println(num);
				System.out.println(sum);
				break;
			}
			num++;
		}
	}
}
