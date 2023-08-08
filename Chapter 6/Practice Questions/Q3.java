/*Question3 : Write a Java program to check if a number is a palindrome in Java ? 
(121 is a palindrome,321 is not) A number is called a palindrome if the number is equal 
to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself.
On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321. */

import java.util.*;

public class Q3 {
    public static int palindrome_check(int a) {
        int expr_num = a;
        int reverse = 0;
        // for (int i = 0; expr_num != 0; i++) {
        // reverse = reverse*((int)Math.pow(10, i)) + (expr_num % 10);
        // expr_num /= 10;
        // }
        while (expr_num != 0) {
            reverse = (reverse * 10) + (expr_num % 10);
            expr_num /= 10;
        }

        if (reverse == a) {
            return reverse;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to check = ");
        int num = in.nextInt();
        if (palindrome_check(num) == 0) {
            System.out.print("The enterd number is not a palindromic squence.");
        } else {
            System.out.print(num + " is a palindromic squence.");
        }
    }
}