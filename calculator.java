import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 = ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 = ");
        int num2 = in.nextInt();
        System.out.print("Enter the sign of the operator = ");
        char ch = in.next().charAt(0);
        switch(ch)
        {
            case '+':
            System.out.println("The Sum of number 1 and 2 = " + (num1+num2));
            break;
            case '-':
            System.out.println("The difference of number 1 and 2 = " + (num1-num2));
            break;
            case '*':
            System.out.println("The product of number 1 and 2 = " + (num1*num2));
            break;
            case '/':
            System.out.println("The division of number 1 and 2 = " + (num1/num2));
            break;
            case '%':
            System.out.println("The Remainder of division of number 1 and 2 = " + (num1%num2));
            break;
            default: System.out.println("Wrong symbol is entered");
        }
    }
}