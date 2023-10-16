package lab4;

import java.util.Arrays;

public class Insertion {
	public static int[] sort(int[] array) {
		for(int i=0;i<array.length;i++) {
			int key=array[i];
			int j=i-1;
			while(j>=0 && array[j]> key) {
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
		}
		return array;
	}
	public static void main (String []args) {
		int[]array= {1,3,5,7,3,7,26,8};
		sort(array);
		System.out.println(Arrays.toString(sort(array)));
	}

}
