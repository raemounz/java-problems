package prime_number;

import java.util.Scanner;
import java.util.StringJoiner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        StringJoiner joiner = new StringJoiner(", ");
        if (num >= 2) {
            for (int i = 2; i <= num; i++) {
                if (isPrime(i)) {
                    joiner.add("" + i);
                }
            }
        }
        System.out.println(joiner.toString());
    }

    private static boolean isPrime(int num) {
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        // WHen you list all factors, the square root will always be in the middle
        for (int i = 3; i * i <= num; i+=2) {
            if (num % i == 0) return false;
        }
        return true;
    }

}