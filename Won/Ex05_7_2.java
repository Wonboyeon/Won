package Won;

public class Ex05_7_2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if((i * 10 + j) + (j * 10 + i) == 99) {
					System.out.println(i + " , " + j);
				}
			}
		}
	}
}
