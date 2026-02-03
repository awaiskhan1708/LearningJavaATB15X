package ex_06_Ternery_Operator;

public class Lab_Task002 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int Max_Out_Of_Three = (n1>n2)? n1 : (n2>n3)? n2 : n3;
        System.out.println("Max Out Of Three: " + Max_Out_Of_Three);

    }
}
