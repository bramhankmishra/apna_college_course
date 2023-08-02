// Question1 : Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = in.nextInt();
        System.out.println((num<0)?num + " is a negative number.": num + " is a positive number.");
    }
}