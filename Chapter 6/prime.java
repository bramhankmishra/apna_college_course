
// To check of a number is prime or not ?
import java.util.*;

public class prime {
    public static boolean prime_check(int a) {
        boolean isPrime = true;             // We can do it without creating a variable of bool type by returning just true/false.
        if (a == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % 2 == 0) {
                    isPrime = false;
                } else {
                    isPrime = true;
                }
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to check = ");
        int num = in.nextInt();
        System.out.print("Is the entered number prime ? " + prime_check(num));
    }
}