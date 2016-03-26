package shape;

import java.util.Arrays;
import java.util.Scanner;

public class AreaCalculator {

	private static AreaCalculator instance;

	private AreaCalculator() {
	}

	static AreaCalculator getinstance() {

		// if the object haven't been initialized
		// create a new one
		if (instance == null) {
			instance = new AreaCalculator();
		}
		return instance;
	}

	public double sumOfArea(Shape s1, Shape s2) {
		return s1.getarea() + s2.getarea();
	}

	public double sumOfArea(Shape s1, Shape s2, Shape s3) {
		return s1.getarea() + s2.getarea() + s3.getarea();
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.println("Please input four integers:");
			Shape rectangleA = new Rectangle(scanner.nextInt(),
					scanner.nextInt());
			Shape squareB = new Square(scanner.nextInt());
			Shape circleC = new Circle(scanner.nextInt());

			Shape[] shapes = new Shape[3];
			shapes[0] = rectangleA;
			shapes[1] = squareB;
			shapes[2] = circleC;

			System.out
					.println("The area of rectangle A:" + shapes[0].getarea());
			System.out.println("The area of square B:" + shapes[1].getarea());
			System.out.println("The area of circle C:" + shapes[2].getarea());

			if (rectangleA.compareTo(squareB) == 1) {
				System.out.println("Rectangle A is larger than square B.");
			} else if (rectangleA.compareTo(squareB) == 0) {
				System.out.println("Rectangle A is equal to square B.");
			} else if (rectangleA.compareTo(squareB) == -1) {
				System.out.println("Rectangle A is smaller than square B.");
			}

			System.out.println("the sum of A&C is "
					+ getinstance().sumOfArea(rectangleA, circleC));
			System.out.println("the sum of A&B is "
					+ getinstance().sumOfArea(squareB, rectangleA));
			System.out.println("the sum of B&C is "
					+ getinstance().sumOfArea(squareB, circleC));
			System.out.println("the sum of A&B&C is "
					+ getinstance().sumOfArea(rectangleA, circleC, squareB));

			// the sort method will use the compareTo method to sort the shape
			Arrays.sort(shapes);
			for (int i = 0; i < shapes.length; i++) {
				System.out.println(shapes[i]);
			}
		}
		//scanner.close();
	}
}
