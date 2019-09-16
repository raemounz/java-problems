package fibonacci_sequence;

import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        fibonacciByStream(num);
        fibonacciByForLoop(num);
    }

    private static void fibonacciByStream(int num) {
        long start = System.nanoTime();
        Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]}).map(i -> i[0]).limit(num).forEach(i -> System.out.print(i + " "));
        System.out.println("\nUsing stream takes " + duration(start) + " ms to complete.\n");
    }

    private static void fibonacciByForLoop(int num) {
        long start = System.nanoTime();
        int temp = 0;
        int[] arr = new int[]{0, 1};
        for (int i = 0; i < num; i++) {
            System.out.print(arr[0] + " ");
            temp = arr[0] + arr[1];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        System.out.println("\nUsing for loop takes " + duration(start) + " ms to complete.");
    }

    private static long duration(long start) {
        return (System.nanoTime() - start) / 1_000_000;
    }

}