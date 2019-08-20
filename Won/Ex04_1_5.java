package Won;

public class Ex04_1_5 {
	public static void main(String[] args) {
		int n1 = ((25 + 5) + (36 / 4) - 72) * 5;
		int n2 = ((25 * 5) + (36 - 4) + 71) / 4;
		int n3 = (128 / 4) * 2 ;
		System.out.println(n1 +  "," + n2 +"," + n3);
		
		boolean b = (n1 > n2 && n2 > n3);
		System.out.println(b);
		
		/*if(n1 > n2 && n2 >n3) {
			System.out.println("true");
		}
		System.out.println("false");
		*/
	}
}
