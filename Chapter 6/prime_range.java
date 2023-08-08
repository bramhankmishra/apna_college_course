
// To print all prime in the given range.
import java.util.*;

public class prime_range {
    public static void range(int lowL, int uperL) {
        boolean isPrime = true;
        for (int i = lowL; i <= uperL; i++) {
            if (i == 2) {
                isPrime = true;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
            }
            if (isPrime == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println("are the prime numbers in a given range");
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter lower limit of the range = ");
        int lowL = in.nextInt();
        System.out.print("Enter upper limit of the range = ");
        int uperL = in.nextInt();
        range(lowL, uperL);
    }
}