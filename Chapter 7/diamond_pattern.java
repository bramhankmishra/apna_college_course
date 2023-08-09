
// Print a diamond_pattern
import java.util.*;

public class diamond_pattern {
    public static void pattern(int size) {
        // First top of half of the diamond
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size+size-1;j++){
                if(j>=size-i+1 && j<=size+i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            } 
            System.out.print("\n");   
        }
        for(int i=size;i>=1;i--){
            for(int j=1;j<=size+size-1;j++){
                if(j>=size-i+1 && j<=size+i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            } 
            System.out.print("\n");   
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size = ");
        int size = in.nextInt();
        pattern(size);
    }
}