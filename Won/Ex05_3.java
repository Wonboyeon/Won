package Won;

public class Ex05_3 {
	public static void main(String[] args) {
		int n = 40;
		
		switch(n / 10) {
		case 0 :
			System.out.println("0�̻� 10�̸� �Դϴ�");
			break;
		case 1 :
			System.out.println("10�̻� 20�̸� �Դϴ�");
			break;
		case 2 : 
			System.out.println("20�̻� 30�̸� �Դϴ�");
			break;
		default :
			System.out.println("�����̰ų� 30�̻��Դϴ�");
			break;
		}
		return;
	}
}
