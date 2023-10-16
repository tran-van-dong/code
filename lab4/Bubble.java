package lab4;

import java.util.Arrays;

public class Bubble {
	public static int[] sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1-i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 7, 2, 4, 2, 5, 1, 6 };
		sort(array);
		System.out.println(Arrays.toString(sort(array)));
	}
}
