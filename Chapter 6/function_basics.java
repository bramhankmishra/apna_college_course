import java.util.*;

public class function_basics {                              //I had a problem in the usage of return keyword therefore I am using it.
    public static int calculate_sum(int a, int b) {         // Parameters or formal parameters
        int sum_func = a + b;
        return sum_func;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("Number 1 = ");
        int num1 = in.nextInt();
        System.out.print("Number 2 = ");
        int num2 = in.nextInt();
        int sum = calculate_sum(num1, num2);                // arguments or actual parameters
        System.out.print("The sum of number 1 and 2 = " + sum);
    }
}