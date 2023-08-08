
// Write a Java method to compute the sum of the digits in an integer.
import java.util.*;

public class Q5 {
    public static int digit_sum(int a) {
        int sum = 0;
        while(a!=0){
            sum = sum + a%10;
            a/=10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer = ");
        int num = in.nextInt();
        System.out.print("The sum the digits = " + digit_sum(num));
    }
}