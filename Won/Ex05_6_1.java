package Won;

public class Ex05_6_1 {
	public static void main(String[] args) {
		int num;
		int count = 0;
		
		for(num = 1; num <= 100; num++) {
			if(num%5 != 0 || num%7 != 0) {
				continue;
			}
			System.out.println(num);
			count++;
		}
		System.out.println("count : " + count);
	}
}
