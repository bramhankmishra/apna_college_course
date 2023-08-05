import java.util.*;

public class take_in_print {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number ");
        long num = in.nextLong();
        int i=1;
        while(i<=num)
        {
            System.out.print(i+ "\t");
            i++;
        }
    }
}