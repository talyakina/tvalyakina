import java.util.Scanner;

public class Factorial {

	static int recursion(int count) {
		int result;
		if (count == 1)
			return 1;
		result = recursion(count - 1) * count;
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число для вычисления факториала");
		int count = in.nextInt();
		System.out.println("Результат вычисления факториала: " + recursion(count));
	}

}
