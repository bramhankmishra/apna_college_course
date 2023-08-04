// Question 3 :Write a program to find the factorial of any number entered by the user.

import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want to find = ");
        long num = in.nextLong();
        long facto = 1;
        if (num != 0)
            for (long i = 2; i <= num; i++) {
                facto *= i;
            }
        if (num == 0) {
            System.out.println("The factorial of the entered number = 1");
        } else
            System.out.println("The factorial of the entered number = " + facto);
    }
}