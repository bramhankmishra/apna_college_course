// Print solid_rhombus_pattern

import java.util.*;

public class solid_rhombus_pattern {
    public static void pattern(int size){
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size+size-i;j++){
                if(j<=size-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of pattern = ");
        int size = in.nextInt();
        pattern(size);
    }
}