
// Question2: Write a method named isEven that accepts an int argument.The method should return true if the argument is even, 
// or false otherwise. Also write a program to test your method.
import java.util.*;

public class Q2 {
    public static boolean isEven(int a) {
        if (a % 2 != 0) {
            return false;
        } else
            return true;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to check = ");
        int num = in.nextInt();
        System.out.print("Is the entered number even = " + isEven(num));
    }
}