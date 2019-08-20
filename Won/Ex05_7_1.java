package Won;

public class Ex05_7_1 {
	public static void main(String[] args) {
		for(int i = 2; i <= 8; i+=2) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("[%d * %d = %d]\t",i,j,i*j);
			}
			System.out.println();
		}
	}

}
