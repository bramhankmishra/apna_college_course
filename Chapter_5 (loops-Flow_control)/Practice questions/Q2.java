// Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        int odd = 0, even = 0;      // To store the value of sum of evens and odds.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of integers that you want to enter = ");
        int n = in.nextInt();
        int integer[] = new int[n]; // To take inputs from the user.
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + "= ");
            integer[i] = in.nextInt();
            if (integer[i] % 2 == 0) {
                even += integer[i];
            } else if (integer[i] % 2 != 0) {
                odd += integer[i];
            } else {
                System.out.println("Wrong input");
            }
        }
        System.out.println("Sum of all the even integers = " + even);
        System.out.println("Sum of all the odd integers = " + odd);

    }
}
