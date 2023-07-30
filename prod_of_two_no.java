import java.util.*;

public class prod_of_two_no {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are going to calculate the product of 2 numbers");
        System.out.print("Enter Number 1 = ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2 = ");
        int num2 = input.nextInt();
        int sum = num1*num2;
        System.out.println(sum);
    }
}
