// Inverted and half pyramid pattern

import java.util.*;

public class Inverted_half_pyramid_patrn {
    public static void pattern(int length){
        for(int i = 1; i<=length; i++){
            for(int j =1; j<=length; j++){
                if(j>=length+1-i){              // We added +1 in order to remove error
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the legth of the rectangle you want to print = ");
        int length = in.nextInt();
        pattern(length);
    }
}