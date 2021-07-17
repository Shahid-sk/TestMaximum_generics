package maximum_generics;

import java.util.Arrays;

public class TestMaximum<E extends Comparable<E>> {

	E[] myArray;

	public TestMaximum(E[] myArray) {
		super();
		this.myArray = myArray;
	}

	public static <E extends Comparable<E>> E maximum(E[] myArray) {
		Arrays.sort(myArray);
		int length = myArray.length;
		E max = myArray[length - 1];
		return max;
	}

	public static void main(String args[]) {
		Integer[] maximum_int = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(maximum(maximum_int));
		Float[] maximum_float = { 1.6f, 1.66f, 2.5f, 2.55f, 3.5f, 3.55f };
		System.out.println(maximum(maximum_float));
		String[] maximum_string = { "a", "b", "c", "d" };
		System.out.println(maximum(maximum_string));

	}
}