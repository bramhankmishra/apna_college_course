/* Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever. */

import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double temp = 103.5;
        System.out.print((temp >= 100) ? "You have fever." : "You don't have fever.");
    }
}