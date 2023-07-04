import java.util.*;

public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("Sum of Number 1 and 2 is = ");
        System.out.println(sum);
    }
}
