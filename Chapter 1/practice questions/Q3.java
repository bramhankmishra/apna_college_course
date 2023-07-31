/*Question 3 : Enter cost of 3 items from the user ( using float datatype ) -a pencil, a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.*;
public class Q3{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println("\t\t\t\t\tBill");
        System.out.print("Enter the price of pencil = ");
        float pencil = in.nextFloat();
        System.out.print("Enter the price of pen = ");
        float pen = in.nextFloat();
        System.out.print("Enter the price of Eraser = ");
        float eraser = in.nextFloat();   
        System.out.print("GST(18%) = ");
        System.out.println((pencil + pen + eraser)*0.18);
        System.out.print("Total Bill = ");
        System.out.print(((pencil + pen + eraser)*0.18)+(pencil + pen + eraser));
    }
}