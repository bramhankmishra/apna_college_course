import java.util.*;

// printing all the numbers entered by user except multiples of 10;
public class continue_ques {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter a number ");
            int num = in.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println("Your number was = " + num);
        } while (true);

    }
}