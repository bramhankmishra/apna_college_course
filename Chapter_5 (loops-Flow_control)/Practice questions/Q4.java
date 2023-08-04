
// Question 4 : Write a program to print the multiplication table of a number N,entered by the user.
import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number whose table you want to print = ");
        int num = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));

        }
    }
}