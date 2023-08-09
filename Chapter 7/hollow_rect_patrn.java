
// Print a pattern of hollow rectangle where user enters length and breadth.
import java.util.*;

public class hollow_rect_patrn {
    public static void pattern(int length, int breadth) {
        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == breadth) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == length) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle = ");
        int length = in.nextInt();
        System.out.print("Enter the breadth of the rectangle = ");
        int breadth = in.nextInt();
        pattern(length, breadth);
    }
}