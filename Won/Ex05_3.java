package Won;

public class Ex05_3 {
	public static void main(String[] args) {
		int n = 40;
		
		switch(n / 10) {
		case 0 :
			System.out.println("0이상 10미만 입니다");
			break;
		case 1 :
			System.out.println("10이상 20미만 입니다");
			break;
		case 2 : 
			System.out.println("20이상 30미만 입니다");
			break;
		default :
			System.out.println("음수이거나 30이상입니다");
			break;
		}
		return;
	}
}
