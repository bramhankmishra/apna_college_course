import java.util.*;
public class if_else_cond{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = in.nextInt();
        if(age>=18){
        {System.out.print("You are eligible to vote and drive");}
        }
        if(age>13 && age<18){
            System.out.print("You are a teenager");
        }
        else{
        System.out.print("You are just a kid");
        }    
    }
}