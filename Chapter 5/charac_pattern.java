import java.util.*;

public class charac_pattern {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char character = 'A';
        System.out.print("Enter the number of lines you want to print = ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
                character++;
            }
            System.out.println("");
        }
    }
}