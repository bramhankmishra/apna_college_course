
// Writing a code to swap 2 numbers using a fuction.  
// Call by value

import java.util.*;

public class swap_func {
    public static void swap(int a, int b) {
        int three_var = a;
        a = b;
        b = three_var;
        System.out.println("The value of num1 " + a);           // If we try printing the value of a and b, we can't do it in main function.
        System.out.println("The value of num2 " + b);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num 1 = ");
        int num1 = in.nextInt();
        System.out.print("Enter num 2 = ");
        int num2 = in.nextInt();
        swap(num1, num2);
    }
}