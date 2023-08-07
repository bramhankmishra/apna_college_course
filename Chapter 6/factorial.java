// To calculate the factorial of number n;

import java.util.*;

public class factorial {
    public static int factorial_func(int number) {
        int result = 1;
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        } else if (number == 0) {
            result = 1;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want to find = ");
        int num = in.nextInt();
        int fact = factorial_func(num);
        System.out.print("The factorial entered number = " + fact);
    }
}