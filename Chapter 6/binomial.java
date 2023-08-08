// binomial coefficient(n,r) = n!/(r!(n-r)!)

import java.util.*;

public class binomial {
    public static int fact(int num) {
        int numr = 1;
        for (int i = 1; i <= num; i++) {
            if (num != 0) {
                numr *= i;
            } else {
                numr = 1;
            }
        }
        return numr;
    }

    public static int binoc(int n, int r) {
        int result;
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n - r);
        return result = (n_fact) / (r_fact * nmr_fact);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = in.nextInt();
        System.out.print("Enter the value of r = ");
        int r = in.nextInt();
        System.out.print("The binomial coefficient of the entered value = " + binoc(n, r));

    }
}