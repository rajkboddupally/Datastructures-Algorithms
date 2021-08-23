package sort;

/*
Merge sort - stable algo
Divide into 2 parts
call mergeSort on 2 parts
finally merge using aux array

MERGE LOGIC
###########
Get Left, Mid and Right indexes
LEFT SUB ARRAY START and END INDEXES ->  Left and Mid
RIGHT SUB ARRAY START and END INDEXES -> Mid+1 and Right
Declare 3 variables leftInd = left starting index & rightInd = mid+1, index = left
iterate until leftInd <= MID && rightInd <= RIGHT
   if(a[leftInd] > a[rightInd]
        temp[index] = a[rightInd]
        rightInd++;
    else
        temp[index] = a[leftInd]
        leftInd++;
    index++;
    ARRAY COPY remaining left elements
    ARRAY COPY remaining right elements
    ARRAY COPY Temp to MainArray
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] input = {32, 10, 4, 67, 98, 23, 12};
        for (int k : input) System.out.print(" " + k);
        System.out.println();
        mergeSort(input, new int[input.length], 0, input.length - 1);
        for (int k : input) System.out.print(" " + k);
    }

    private static void mergeSort(int[] input, int[] aux, int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;
        mergeSort(input, aux, left, mid);
        mergeSort(input, aux, mid + 1, right);
        merge(input, aux, left, mid, right);
    }

    private static void merge(int[] input, int[] aux, int left, int mid, int right) {
        int index = left;
        int leftPtr = left;
        int rightPtr = mid + 1;

        while (leftPtr <= mid && rightPtr <= right) {
            if (input[leftPtr] < input[rightPtr]) {
                aux[index] = input[leftPtr];
                leftPtr++;
            } else {
                aux[index] = input[rightPtr];
                rightPtr++;
            }
            index++;
        }
        System.arraycopy(input, leftPtr, aux, index, mid + 1 - leftPtr);
        System.arraycopy(input, rightPtr, aux, index, right + 1 - rightPtr);
        System.arraycopy(aux, left, input, left, right - left + 1);
    }
}
