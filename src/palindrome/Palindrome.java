package palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(String.format("%s is %sa palindrome.", str, (!isPalindrome ? "not " : "")));
    }

}