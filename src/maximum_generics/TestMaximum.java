package maximum_generics;

import java.util.Scanner;

public class TestMaximum {
	public static String testMax(String name1, String name2, String name3) {

		String maximum = name1;
		if (name2.compareTo(maximum) > 0) {
			maximum = name2;
		}
		if (name3.compareTo(maximum) > 0) {
			maximum = name3;
		}
		return maximum;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x,y,z value");
		String x = sc.next();
		String y = sc.next();
		String z = sc.next();
		sc.close();
		System.out.println("maximum value is:" + testMax(x, y, z));
	}

}
