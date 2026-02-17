package ex_exam_Basics;

public class ProblemStatement_Twelve {
    public static void main(String[] args) {

    int i = 1;

    // do-while loop
        do {
        if (i == 5) {
            break;  // exit loop when i is 5
        }

        System.out.println(i);
        i++;

    } while (i <= 10);
}
}
