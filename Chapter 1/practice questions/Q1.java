/* Question1: Inaprogram,input3numbers:A, B and C.
You have to output the average of these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */
import java.util.*;
public class Q1 {
 public static void main (String args[]){
    Scanner n = new Scanner (System.in);
    System.out.println("Enter 3 numbers ");
    System.out.print("Enter number 1 =");
    int num1 = n.nextInt();
    System.out.print("Enter number 2 = ");
    int num2 = n.nextInt();
    System.out.print("Enter number 3 = ");
    int num3 = n.nextInt();
    System.out.print("The Average of the entered 3 numbers is = ");
    int avg = (num1+num2+num3)/3;
    System.out.println(avg);
 }
}