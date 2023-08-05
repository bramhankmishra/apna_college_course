import java.util.*;

public class print_sum_natural {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to find the sum = ");
        long num = in.nextLong();
        long i = 1, sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println(" The sum of " + num + " natural number = " + sum);
    }
}   `