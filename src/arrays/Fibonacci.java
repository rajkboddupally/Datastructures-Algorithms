package arrays;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int i) {

        if(i == 0 || i == 1)
            return 1;

        return fibonacci(i-1) + fibonacci(i-2);

    }


}
