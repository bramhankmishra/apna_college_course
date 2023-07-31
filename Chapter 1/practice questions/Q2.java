/*In a program, input the side of a square. You have to output the area of the square.
(Hint : area of a square is (side x side))*/

// In order to make this intresting I am going to use The function java.lang.Math.pow(). 
// The function java.lang.Math.pow() always returns a double datatype. 

import java.util.*;
import java.lang.Math;
public class Q2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a side of the square = ");
        double side = in.nextDouble();
        System.out.print("The area of the square = ");
        System.out.print(side*side);
        int a = (int)(Math.pow(side,2));
    }
}