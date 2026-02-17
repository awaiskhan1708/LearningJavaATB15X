package ex_exam_Basics;

import java.util.Scanner;

public class ProblemStatement_Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        int orignal = num1;
        int reverse = 0;

        do {
            int digit = num1 % 10;          // get last digit
            reverse = reverse * 10 + digit;
            num1 = num1 / 10;                // remove last digit
        } while (num1 != 0);

        // Output result
        System.out.println("Original number: " + orignal);
        System.out.println("Reversed number: " + reverse);

        scanner.close();
    }
}

