package ex_04_Operators;

public class Lab033_ModulusOperator {
    public static void main(String[] args) {
        int a =10;
        int b=20;
    System.out.println(a%b);
    // 10 | 20 | 2  where 2 is quotient
    //    |20 |
        //--------
        // 00 -  00 is reminder
        System.out.println(13%7);
        // 7 | 13 | 1
        //   | 1 |
        // ----------
        //    6 - Reminder

        //If you %2 with if even number it will give 0
        // if it is odd it will give 1
        //any number with % 2 if it is zero then it is even or else it odd

    }
}
