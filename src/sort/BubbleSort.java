package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArray = { 26, -6, 3, 65, 12, 0, 5 };

		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[i + 1])
					swap(intArray, i, i + 1);
			}
		}

		for (int j = 0; j < intArray.length; j++)
			System.out.print(intArray[j] + " ");
	}

	private static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}
