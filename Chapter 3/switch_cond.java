import java.util.*;

public class switch_cond {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0); 
        // next() function returns the next token/word in the input as a string and charAt(0),
        // function returns the first character in that string, the number 0 in the
        // function in CharAt(NUMBER) represents the index of the single word of the
        // string taken input, and set that index character to the char variable.
        switch(ch)
        {
            case '!': System.out.println("! was used");
                    break;
            case '@': System.out.println("@ was used");
                    break;
            case '#': System.out.println("# was used");
                    break;
            case '$': System.out.println("$ was used");
                    break;
            default: System.out.println("Default case was used. ");
        }
    }
}