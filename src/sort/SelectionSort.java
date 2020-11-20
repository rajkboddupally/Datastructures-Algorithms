package sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] intArray = { 46, 26, -6, 3, 65, 12, 0, 5 };
		int max = 0;
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			max = 0;
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[max]) {
					max = i;
				}
			}
			swap(intArray, max, lastUnsortedIndex);
		}
		
		Arrays.stream(intArray).forEach(System.out::println);
	}

	private static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}
