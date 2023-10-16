package lab4;

public class Merge {
	public static int[] merge(int array[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for (int i = 0; i < n1; ++i) {
			left[i] = array[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			right[j] = array[m + 1 + j];
		}
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			array[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = right[j];
			j++;
			k++;
		}
		return array;
	}

	static void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public static void printArray(int array[]) {
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int array[] = { 1, 4, 5, 2, 6, 2, 9, 2, 4 };

		System.out.println("Mảng ban đầu:");
		printArray(array);

		sort(array, 0, array.length - 1);
		System.out.println("Mảng sau khi sắp xếp:");
		printArray(array);

	}
}
