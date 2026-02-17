package ex_exam_Basics;

public class ProblemStatement_Thirteen {
    public static void main(String[] args) {

        int i = 1;

        do {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
