
// Write a code to convert binary code to decimal.
import java.util.*;

public class bi2di {
    public static int converter(int a) {
        int result = 0;
        for (int i = 0; a != 0; i++) {
            result = result + (int) (Math.pow(2, i) * (a % 10));
            a /= 10;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter binary code = ");
        int binary_code = in.nextInt();
        System.out.print("The decimal code for the entered binary code = " + converter(binary_code));
    }
}