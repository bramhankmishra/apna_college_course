import java.util.*;
public class largest_no{
    public static void main(String args[]){
        System.out.println("The compute will return largest of the two entered number.");
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number 1 = ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 = ");
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.print(num1 + " is greater than " + num2);
        }
        if(num1==num2){
            System.out.print(num1 + " is equal to " + num2);
        }
        
        if(num2>num1){
            System.out.print(num2 + " is greater than " + num1);
        }

        else{
            System.out.print("You have enetered a wrong input.");
        }
    }
}