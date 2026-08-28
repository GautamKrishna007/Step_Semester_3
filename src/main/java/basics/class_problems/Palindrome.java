package basics.class_problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        if (number < 100) {
            System.out.println("Please enter a number with at least 3 digits.");
            return;
        } else {
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber + " is a palindrome.");
            } else {
                System.out.println(originalNumber + " is not a palindrome.");
            }
        }
    }
}
