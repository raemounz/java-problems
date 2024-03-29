package factorial;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        factorialByStream(num);
        factorialByForLoop(num);
    }

    private static void factorialByStream(int num) {
        long start = System.nanoTime();
        long factorial = LongStream.rangeClosed(1, num).reduce(1L, (a, b) -> a * b);
        System.out.print(factorial);
        System.out.println(String.format("\nUsing stream takes %d ms to complete.\n", duration(start)));
    }

    private static void factorialByForLoop(int num) {
        long start = System.nanoTime();
        long factorial = 1;
        for (long i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.print(factorial);
        System.out.println(String.format("\nUsing for loop takes %d ms to complete.", duration(start)));
    }

    private static long duration(long start) {
        return (System.nanoTime() - start) / 1_000_000;
    }

}