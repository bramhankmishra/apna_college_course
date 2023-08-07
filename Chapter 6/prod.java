
// To find the product of given number.
import java.util.*;

public class prod {
    public static int prod_func(int a, int b) {
        int prod = a * b;
        return prod;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 = ");
        int n1 = in.nextInt();
        System.out.print("Enter number 2 = ");
        int n2 = in.nextInt();
        int prod_main = prod_func(n1, n2);
        System.out.print("The product of a and b = " + prod_main);
    }
}