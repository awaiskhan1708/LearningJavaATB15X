package ex_06_Ternery_Operator;

import org.w3c.dom.ls.LSOutput;

public class Lab058_TaskTerneryOperator {
    public static void main(String[] args) {
        int marks = 30;
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
