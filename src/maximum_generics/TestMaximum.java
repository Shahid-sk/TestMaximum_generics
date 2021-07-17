package maximum_generics;
import java.util.Scanner;
public class TestMaximum {
	public static Integer testMax(Integer number1, Integer number2, Integer number3) {

		Integer maximumNumber = number1;
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
		Integer x = sc.nextInt();
		Integer y = sc.nextInt();
		Integer z = sc.nextInt();
		sc.close();
		System.out.println("maximum value is:" + testMax(x, y, z));
	}

}
