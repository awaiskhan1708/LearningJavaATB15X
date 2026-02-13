package ex_06_Ternery_Operator;

public class Lab057_TerneryOperatorThree {
    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 23;
        int num3 = 22;
        int Max_Out_of_Three = (num1>num2)? num1 : (num2>num3)? num2 : num3;
        System.out.println(Max_Out_of_Three);
    }
}
