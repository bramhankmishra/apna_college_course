import java.util.*;

public class result{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the marks = ");
        int marks = in.nextInt();
        System.out.print((marks>33) ? "The student is pass ":"The Student the fail." ); // I figured out this way where I have avoided the usage of extra variable which would have stored the value of the result of ternary operation. 
       
       
        // if(marks>33)
        // {
        //     System.out.print("The student is pass");
        // }
        // else 
        // System.out.print("The Student the fail.");
    }
}