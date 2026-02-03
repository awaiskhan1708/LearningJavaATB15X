package ex_07_Loops;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a==b && a==c) {
            System.out.println("Triangle");
        }
            else if (a==b || b==c)
        {
            System.out.println("isosceles Triangle");
        }
        else{
System.out.println("scalene Triangle");
            }
        }
    }
