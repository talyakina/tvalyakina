import java.util.Scanner;

public class Calc2 {
	public static void main(String[] args) {

		for (int i = 0; i < 1; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("������� �����");
			int num1 = in.nextInt();
			System.out.println("������� �������, � ������� ���������� �������� �����");
			int num2 = in.nextInt();
			int result = (int) Math.pow(num1, num2);
			System.out.println("��������� ���������� � �������: " + result);
		}

	}
}
