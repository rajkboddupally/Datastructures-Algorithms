package sort;

/*
INPUT - 5 1 4 2 8

i=0 -> length-1
j=1 -> length-1-i
if(a[j-1] > a[j]) swap

i=0 j=1->4  1 4 2 5 8
i=1 j=1->3  1 2 4 5 8
i=2 j=1->2  1 2 4 5 8
i=3 j=1->1  1 2 4 5 8

 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {5, 1, 4, 2, 8};

        bubbleSort(intArray);

        for (int j = 0; j < intArray.length; j++)
            System.out.print(intArray[j] + " ");
    }

    private static void bubbleSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length - i; j++) {
                System.out.println("i-" + i + " j-" + j);
                if (input[j - 1] > input[j])
                    swap(input, j - 1, j);
            }
        }
    }

    private static void swap(int[] input, int x, int y) {
        int temp = input[x];
        input[x] = input[y];
        input[y] = temp;
    }
}
