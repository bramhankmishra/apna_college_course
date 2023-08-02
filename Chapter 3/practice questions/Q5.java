/*Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not. 
To check if a year is a leap year, divide the year by 4. If it is fully divisible by 4, it is a leap year. 
For example, the year 2016 is divisible 4, so it is a leap year, whereas, 2015 is not. 
However, Century years like 300, 700, 1900, 2000 need to be divided by 400 to check whether they are leap years or not. 
*/

import java.util.*;

public class Q5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year you want to check = ");
        int year = in.nextInt();
        if (year % 100 == 0) { // In this line we are checking if the year entered is a century or not.
            System.out.println((year % 400 == 0) ? (year + " is a leap year.") : (year + " is not a leap year."));

            // if (year % 400 == 0) {
            // System.out.println(year + " is a leap year.");
            // }
            // else
            // System.out.println(year + " is not a leap year.");

        }

        // System.out.println((year % 4 == 0)? (year + " is a leap year."):("you have
        // entered a wrong value") );
        // we can not write the above statement as it will excecute whatever happens,
        // whether the above mentioned condition is true or false.

        else if (year % 4 == 0) // In the above check the year must have been found not to be a century, thus we
                                // check here
        {
            System.out.println(year + " is a leap year.");
        }

        else
            System.out.println("you have entered a wrong value");
    }
}