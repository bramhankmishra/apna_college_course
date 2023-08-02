// income tax calculator
/*
  1. income < 5l
  0% tax
  2. income between 5-10l
  20% tax
  3. income > 10l
  30% tax
 */

 import java.util.*;

 public class income_tax{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter your income = ");
        int income = in.nextInt();
        if ( income < 500000){
            System.out.print("Tax = 0%");
        }
        else if(income >=50000 && income<=1000000)
        {
            System.out.println("Tax = 20 %");
            System.out.print("Tax = "+ income*0.2);
        }
        else if(income >1000000)
        {
            System.out.println("Tax = 30 %");
            System.out.print("Tax = " + income*0.3);
        }

    }
 }