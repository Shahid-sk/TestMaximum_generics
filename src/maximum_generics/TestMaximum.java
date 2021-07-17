package maximum_generics;

import java.util.Scanner;

public class TestMaximum<E extends Comparable<E>> {
	E x, y, z;

	public TestMaximum(E x, E y, E z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public E maximum() {
		return TestMaximum.testMax(x, y, z);
	}

	public static <E extends Comparable<E>> E testMax(E x, E y, E z) {

		E maximum = x;
		if (y.compareTo(maximum) > 0) {
			maximum = y;
		}
		if (z.compareTo(maximum) > 0) {
			maximum = z;
		}
		return maximum;
	}

	public static <E> void printMax(E x, E y, E z, E maximum) {
		System.out.printf("Max of %s,%s and %s is %s \n ", x, y, z, maximum);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x,y,z values for integer data");
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		System.out.println("maximum value is:" + testMax(a, b, c));
		TestMaximum<Integer> printMaxInteger = new TestMaximum<Integer>(a, b, c);
		printMaxInteger.maximum();

		System.out.println("enter x,y,z values for float data");
		Float a1 = sc.nextFloat();
		Float b1 = sc.nextFloat();
		Float c1 = sc.nextFloat();
		System.out.println("maximum value is:" + testMax(a1, b1, c1));
		TestMaximum<Float> printMaxFloat = new TestMaximum<Float>(a1, b1, c1);
		printMaxFloat.maximum();
		System.out.println("enter x,y,z values for string data");
		String a2 = sc.next();
		String b2 = sc.next();
		String c2 = sc.next();
		TestMaximum<String> printMaxString = new TestMaximum<String>(a2, b2, c2);
		printMaxString.maximum();
		System.out.println("maximum value is:" + testMax(a2, b2, c2));
		sc.close();

	}
}