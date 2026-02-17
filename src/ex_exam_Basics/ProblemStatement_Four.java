package ex_exam_Basics;

import java.util.Scanner;

public class ProblemStatement_Four {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First number ");
        int a = scan.nextInt();
        System.out.println("Enter your Second number ");
        int b = scan.nextInt();

        int max = a > b ? a : b;

        if(max>a){
            System.out.println("Heighst number is " + max);
        }
    }
}
