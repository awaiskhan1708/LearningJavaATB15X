package ex_05_TypeCasting;

public class Lab056_TypeCastingSix {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch; // Widening

        int num = 66; // Narrow
        char letter = (char) num;
       // System.out.println(letter);

    }
}
