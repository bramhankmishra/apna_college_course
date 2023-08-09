
// Write a program to print 0_1_triangle;
// Here the logic is = if the sum of matrix position = Even then print -1 ; else print 0
import java.util.*;

public class zero_one_triangle {
    public static void pattern(int size) {
        boolean print = true;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {     //even
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of triangle = ");
        int size = in.nextInt();
        pattern(size);
    }
}