package fibonacci_nth;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        scanner.close();
        int temp = 0;
        for (int i = 2; i < intArr[2]; i++) {
            temp = intArr[0] + intArr[1];
            intArr[0] = intArr[1];
            intArr[1] = temp;
        }
        System.out.println(intArr[1]);
    }

}