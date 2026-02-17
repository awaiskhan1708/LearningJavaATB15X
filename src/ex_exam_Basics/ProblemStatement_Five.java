package ex_exam_Basics;

import java.util.Scanner;

public class ProblemStatement_Five {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scan.nextInt();

        String result = (a>0)? "Positive" : (a < 0) ? "Negative" : "Zero";
        System.out.println(result);

        scan.close();
    }
}
