package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_GradeCalculator {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int a =Scanner.nextInt();

        if(a>=90 && a<=100){
            System.out.println("A");
        }
        else if(a>=80 && a<=89){
            System.out.println("B");
        }
        else if(a>=70 && a<=79){
            System.out.println("C");
        }
        else if(a>=60 && a<=69){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
