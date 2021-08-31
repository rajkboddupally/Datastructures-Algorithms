package heap;

import java.util.Arrays;

/* Raj Kumar Boddupally created on 8/31/2021 inside the package - heap */
/*
Implementation of Min heap
 */
public class Heap {
    private int[] items;
    private int size;
    private int capacity;

    public Heap(int capacity) {
        this.capacity = capacity;
        items = new int[this.capacity];
    }

    public static void main(String[] args) {

        Heap heap = new Heap(4);
        heap.offer(6);
        heap.offer(4);
        heap.offer(7);
        heap.offer(2);
        heap.offer(1);
        heap.offer(3);
        heap.offer(10);
        heap.print();
        System.out.println(heap.peek());
        System.out.println(heap.poll());
        heap.print();
        heap.offer(5);
        heap.print();
        heap.offer(5);
        heap.print();

        heap.offer(15);
        heap.offer(2);
        heap.offer(8);

        heap.print();

    }

    public int size() {
        return this.size;
    }

    public boolean offer(int item) {
        checkCapacity();
        items[size] = item;
        heapifyUp(size);
        size++;
        return items[size - 1] == item;
    }

    public int peek() {
        return this.items[0];
    }

    public int poll() {
        int item = this.items[0];
        size--;
        swap(0, size);
        heapifyDown(0);
        items[size] = 0;
        return item;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < Math.pow(2, i) && j + Math.pow(2, i) < size; j++) {
                System.out.print(items[j + (int) Math.pow(2, i) - 1] + " ");
            }
            System.out.println();
        }
    }

    private void checkCapacity() {
        if (size == capacity) {
            capacity *= 2;
            items = Arrays.copyOf(items, capacity);
        }
    }

    private void heapifyUp(int index) {
        while (hasParent(index)) {
            int parentIndex = getParentIndex(index);
            if (items[parentIndex] < items[index])
                break;
            else
                swap(parentIndex, index);
            index = parentIndex;
        }
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private boolean hasParent(int index) {
        return index > 0 && getParentIndex(index) >= 0;
    }

    private void heapifyDown(int index) {
        while (hasLeftChild(index)) {
            int smallChildIndex = getLeftChildIndex(index);

            if (hasRightChild(index) && getRightChild(index) < getLeftChild(index))
                smallChildIndex = getRightChildIndex(index);

            if (items[index] < items[smallChildIndex])
                break;
            else
                swap(index, smallChildIndex);
            index = smallChildIndex;
        }
    }

    private int getLeftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private int getRightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private void swap(int item1, int item2) {
        int temp = items[item1];
        items[item1] = items[item2];
        items[item2] = temp;
    }
}
