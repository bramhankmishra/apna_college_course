
// Write a code to convert decimal code to binary.
import java.util.*;

public class di2bi {
    public static int converter(int integer) {
        int result = 0;
        for (int i = 0; integer != 0; i++) {
            result = result + ((integer % 2) * (int)(Math.pow(10,i)));
            integer/=2;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the decimal code = ");
        int decimal_code = in.nextInt();
        System.out.print("The binary code for the entered decimal code =  "+ converter(decimal_code));
    }
}