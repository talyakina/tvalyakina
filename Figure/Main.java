import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Choose the figure: Square, Triangle, Circle, Rectangle");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.equals("Square")) {
			Square square = new Square();
			square.setSquare(5, 5);
			System.out.println("What to count? 1-S or 2-P ");
			String s1 = sc.nextLine();
			if (s1.equals("1")) {
				System.out.println("S of square: " + square.getS());
			}
			if (s1.equals("2")) {
				System.out.println("P of square:: " + square.getP());
			}
		}

		if (s.equals("Triangle")) {
			Triangle triangle = new Triangle();
			triangle.setTriangle(5, 6, 7, 4);
			System.out.println("What to count? 1-S or 2-P ");
			String s1 = sc.nextLine();
			if (s1.equals("1")) {
				System.out.println("S of triangle: " + triangle.getS());
			}
			if (s1.equals("2")) {
				System.out.println("P of triangle: " + triangle.getP());

			}
		}
		if (s.equals("Circle")) {
			Circle circle = new Circle();
			circle.setCircle(5, 5);
			System.out.println("What to count? 1-S or 2-P ");
			String s1 = sc.nextLine();
			if (s1.equals("1")) {
				System.out.println("S of circle: " + circle.getS());
			}
			if (s1.equals("2")) {
				System.out.println("P of circle: " + circle.getP());
			}
		}

		if (s.equals("Rectangle")) {
			Rectangle rectangle = new Rectangle();
			rectangle.setRectangle(5, 4);
			System.out.println("What to count? 1-S or 2-P ");
			String s1 = sc.nextLine();
			if (s1.equals("1")) {
				System.out.println("S of rectangle: " + rectangle.getS());
			}
			if (s1.equals("2")) {
				System.out.println("P of rectangle: " + rectangle.getP());
			}
		}
	}
}