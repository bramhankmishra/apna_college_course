import java.util.*;
public class even_odd{
    public static void main(String args[]){
        System.out.print("Enter a number = ");
        Scanner in  = new Scanner (System.in);
        int num = in.nextInt();
        if((num%2)==0){
            System.out.print(num + " is an even number");
        }
        if((num%2)!=0){
            System.out.print(num + " is an odd number");
        }
      
    }
}