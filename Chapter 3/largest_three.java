// Taking three inputs from the user and throwing largest number as the output among those.

import java.util.*;
public class largest_three{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number 1 = ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 = ");
        int num2 = in.nextInt();
        System.out.print("Enter number 3 = ");
        int num3 = in.nextInt();
        if( (num1>=num2) && (num1>=num3)){
            System.out.println(num1 + " is the largest among all the entered number.");
        }
        else if(num2>=num3){
            System.out.println(num2+ " is the largest among all.");
        }
        else 
        System.out.println(num3 + " is the lartest among all.");
    }
}