import java.util.*;

public class break_question {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter number = ");
            int n = in.nextInt();
            if (n % 10 == 0) {
                System.out.println("You have entered a multiple of 10, terminating program now....");
                break;
            }
        } while (true);
    }
}