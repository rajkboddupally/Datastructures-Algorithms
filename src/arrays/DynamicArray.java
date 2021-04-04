package arrays;

public class DynamicArray {

    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        
    }

    public void add(int element) {
        if (size == capacity) {
            increment(2 * capacity);
        }
        arr[size++] = element;
    }

    private void increment(int newCapacity) {
        int[] newArr = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        capacity = newCapacity;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        DynamicArray d = new DynamicArray(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        d.add(6);
        d.print();

        System.out.println(d.size + " - " + d.capacity);

    }
}
