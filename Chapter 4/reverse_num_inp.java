import java.util.*;

public class reverse_num_inp {
    public static void main(String args[]) { // In this code we are reversing a number and storing it in a variable.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number that you want to reverse = ");
        long num = in.nextLong();
        long reverse = 0; 
        while(num!=0){
            reverse = reverse*10 + num%10;
            num/=10;
         }
         System.out.println("Reverse of the enetered number = "+ reverse);
    }
}