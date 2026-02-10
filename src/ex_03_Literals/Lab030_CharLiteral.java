package ex_03_Literals;

public class Lab030_CharLiteral {
    public static void main(String[] args) {
        char C1 = 'A';
        //A-Z, a-z, @#$%^&*
        //char C2 ="A"; double quotes so its a string
        char C2 = 'B';
        char C3 = ' ';
        char C4 = '!';
        char C5 = '#';
        char C6 = '$';
        char C7 = '%';
        char C8 = '^';
        char C9 = '&';
        char C10 = '*';
        char C11 = '+';
        char C12 = '@';
        char C13 = '1';

        //escape sequence
        char newtab = '\n';
        char tabLine = '\t';
        char backspace = '\b';
        char carriageReturn = '\r';
        System.out.println("AwaisKhan");
        System.out.println("Awais"+newtab +"Khan");
        System.out.println("Awais"+tabLine +"khan");
        System.out.println("Awais"+backspace +"khan");
        System.out.println("Awais"+carriageReturn +"khan");


        char rupees = 'R';
        //Ascii character R - 82 where A is 65
        System.out.println(rupees);
        char mySmiley = '\u1f60';
        System.out.println(mySmiley);
    }
}
