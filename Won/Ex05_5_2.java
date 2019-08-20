package Won;

public class Ex05_5_2 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 5; j <= 5; j++) {
				System.out.printf("[%d * %d = %d]\t", j,i,i*j);
			}
			System.out.println();
		}
	}
}
