package ex_08_If_Condition;

import java.util.Scanner;

public class Lab080_LabClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a==b && a==c) {
            System.out.println("Triangle is equilateral ");
        } else if (a==b || b==c) {
            System.out.println("Triangle is isosceles ");
        }
        else {
            System.out.println("Triangle is scalene  ");
        }
    }
}
