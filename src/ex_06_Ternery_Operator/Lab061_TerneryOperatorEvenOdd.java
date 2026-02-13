package ex_06_Ternery_Operator;

public class Lab061_TerneryOperatorEvenOdd {
    public static void main(String[] args) {
        int num = 13;
        String result = (num%2 ==0) ? "even" : "odd";
        System.out.println(result);
    }
}
