// using ternary operator we find the largest among the following.

import java.util.*;
public class ternary_op{
    public static void main(String args[]){
        Scanner in= new Scanner (System.in);
        System.out.print("Enter number 1 = ");
        int num1 = in.nextInt();
        System.out.print("Enter number 1 = ");
        int num2 = in.nextInt();
        String type = (num1>num2)?(num1 + " is greater than " + num2):(num2 + " is greater than " + num1) ;
        System.out.print(type);
    }
}