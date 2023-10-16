package lab4;

import java.util.Arrays;

public class Selection {
	public static int[] selectionMin(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;

		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 1, 9, 0, 5, 3, 2, 6, 4, 7, 2, 5, 6, 8, 3 };
		selectionMin(array);
		System.out.println(Arrays.toString(selectionMin(array)));
	}
}