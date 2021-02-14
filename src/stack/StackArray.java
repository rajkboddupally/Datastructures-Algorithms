package stack;

import java.util.Random;

public class StackArray {

    private int size;
    private int[] arr;

    public StackArray() {
        this.arr = new int[2];
    }

    public StackArray(int initialCapacity) {
        this.arr = new int[initialCapacity];
    }

    public static void main(String[] args) throws Exception {
        //Thread.sleep(10000);
        StackArray sa = new StackArray();
        long startTime = System.nanoTime();
        Random r = new Random();

        for (int i = 0; i < 100000000; i++) {
            sa.push(r.nextInt());
        }
        Runtime rt = Runtime.getRuntime();

        System.out.println(rt.totalMemory() / (1024 * 1024));
        System.out.println(rt.freeMemory() / (1024 * 1024));


        long endTime = System.nanoTime();

        System.out.println("Runtime " + (endTime - startTime) / 1000000);
        //sa.print();

    }

    private void print() {
        for (int i = 0; i < size; i++)
            System.out.println(arr[i]);

    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void push(int element) {
        if (size == arr.length)
            expandStack(size * 2);
        arr[size++] = element;
    }

    private void expandStack(int newLength) {
        int[] newArr = new int[newLength];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;

        //System.out.println("size doubled " + size() + " ;" + arr.length);

    }

    private void compressStack(int newLength) {
        int[] newArr = new int[newLength];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;

        System.out.println("size compressed " + size() + " ;" + arr.length);

    }

    public int pop() throws Exception {

        if (isEmpty())
            throw new Exception("Empty stack");

        if (size == arr.length / 4)
            compressStack(arr.length / 2);

        int element = arr[--size];
        arr[size] = 0;
        return element;
    }

}
