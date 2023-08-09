
// Print butterfly_pattern.
import java.util.*;

public class butterfly_pattern {
    public static void pattern(int size) {
        for(int i=1;i<=size;i++){
            for(int j=0;j<=size+size;j++){
                if(j<=i-1 || j>=size+size-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for(int i=size;i>=1;i++){
            for(int j=0;j<=size+size;j++){
                if(j<=i-1 || j>=size+size-i+1){
                    System.out.print("*");              // It's not fully correct. as there are spaces in the middle when printed.
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
        System.out.print("Enter the size of the pattern = ");
        int size = in.nextInt();
        pattern(size);
    }
}

