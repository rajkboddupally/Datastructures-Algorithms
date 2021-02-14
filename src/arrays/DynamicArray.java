package arrays;

public class DynamicArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    private static class DynamicArrayEx {
        private int[] arr;
        private int size;
        private int capacity;

        public DynamicArrayEx(int size) {
            arr = new int[2];
            this.capacity = 2;
        }

        public void add(int num) {
            if (size == capacity) {
                increaseCapacity(2);
            }
            arr[size] = num;
            size++;
        }

        private void increaseCapacity(int i) {
            int[] newArr = new int[capacity * 2];
            for (int j = 0; j < arr.length; j++)
                newArr[j] = arr[j];

            arr = newArr;

            capacity = capacity * 2;

        }

    }

}
