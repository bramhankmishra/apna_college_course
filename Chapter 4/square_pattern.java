import java.util.*;

public class square_pattern {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of aquare = ");
        int side = in.nextInt();
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }
}