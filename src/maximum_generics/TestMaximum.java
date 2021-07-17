package maximum_generics;

import java.util.Scanner;

public class TestMaximum {
	public static float testMax(Float number1, Float number2, Float number3) {

		Float maximumNumber = number1;
		if (number2.compareTo(maximumNumber) > 0) {
			maximumNumber = number2;
		}
		if (number3.compareTo(maximumNumber) > 0) {
			maximumNumber = number3;
		}
		return maximumNumber;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x,y,z value");
		Float x = sc.nextFloat();
		Float y = sc.nextFloat();
		Float z = sc.nextFloat();
		sc.close();
		System.out.println("maximum value is:" + testMax(x, y, z));
	}

}
