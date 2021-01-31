package queue;

public class PriorityQueue {
    private int size;
    private int[] queue;
    private int capacity;

    public PriorityQueue() {
        this.queue = new int[11];
        this.capacity = queue.length;
        this.size = 0;
    }

    public void add(int element) {
        queue[size++] = element;
        heapifyUp(element);
    }

    private void heapifyUp(int element) {

        int elementIndex = size - 1;
        int parentIndex = parent(elementIndex);

        while (size > 0 && queue[parentIndex] > queue[elementIndex]) {
            int temp = queue[parentIndex];
            queue[parentIndex] = queue[elementIndex];
            queue[elementIndex] = temp;
            elementIndex = parentIndex;
            parentIndex = parent(parentIndex);
        }
    }

    public int poll() {
        int topElement = queue[0];

        heapifyDown();

        size--;
        return topElement;
    }

    private void heapifyDown() {
        queue[0] = queue[size - 1];
        int parentIndex = 0;
        while(queue[parentIndex] > queue[getMinChild(parentIndex)] && getMinChild(parentIndex) <= size){
            int minChildIndex = getMinChild(parentIndex);
            int temp = queue[minChildIndex];
            queue[minChildIndex] = queue[parentIndex];
            queue[parentIndex] = temp;

            parentIndex = minChildIndex;
        }

        // while ()

    }

    private int getMinChild(int parentIndex) {

        return queue[2 * parentIndex + 1] > queue[2 * parentIndex + 2] ? 2 * parentIndex + 2 : 2 * parentIndex + 1;

    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add(2);
        q.add(3);
        q.add(1);
        q.add(10);
        q.add(6);
        q.add(8);
        q.add(4);


        //System.out.println(q.getSize());

        System.out.println(q.poll());

        System.out.println(q.poll());

        System.out.println(q.poll());

        System.out.println(q.poll());

        System.out.println(q.poll());

        System.out.println(q.poll());

        System.out.println(q.poll());

        System.out.println(q.poll());
    }
}
