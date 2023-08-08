// Question 1 :Write a Java method to compute the averageof three numbers.

import java.util.*;

public class Q1 {
    public static int avg(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1 = ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2 = ");
        int num2 = in.nextInt();
        System.out.print("Enter number 3 = ");
        int num3 = in.nextInt();
        System.out.println("The average of the entered numbers = "+ avg(num1, num2, num3));
    }
}