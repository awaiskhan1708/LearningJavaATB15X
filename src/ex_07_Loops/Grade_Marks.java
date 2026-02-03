package ex_07_Loops;

import java.util.Scanner;

public class Grade_Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
if (marks>=90 && marks<=100)
{
    System.out.println("A");
}
else if (marks>=80 && marks<=89)
{
    System.out.println("B");
}
else if (marks>=70 && marks<=79)
{
    System.out.println("C");
}
else if (marks>=60 && marks<=69)
{
    System.out.println("D");
}
else
{
    System.out.println("F");
}
    }
}
