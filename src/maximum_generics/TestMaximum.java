package maximum_generics;

import java.util.Scanner;

public class TestMaximum {
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

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x,y,z values for integer data");
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		System.out.println("maximum value is:" + testMax(a, b, c));

		System.out.println("enter x,y,z values for float data");
		Float a1 = sc.nextFloat();
		Float b1 = sc.nextFloat();
		Float c1 = sc.nextFloat();
		System.out.println("maximum value is:" + testMax(a1, b1, c1));

		System.out.println("enter x,y,z values for string data");
		String a2 = sc.next();
		String b2 = sc.next();
		String c2 = sc.next();
		System.out.println("maximum value is:" + testMax(a2, b2, c2));
		sc.close();

	}
}