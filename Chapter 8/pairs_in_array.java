
// Pairs_in_array
import java.util.*;

public class pairs_in_array {
    public static void pairs(int arr[]) {
        int total_pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                total_pairs++;
            }
            System.out.print("\n");
        }
        System.out.print("Total pairs = " + total_pairs); // total pairs could have been calculated using (n*(n-1))/2; n
                                                          // = total number of elements in an array.
    }

    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " = ");
            arr[i] = in.nextInt();
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        input(arr);
        pairs(arr);
    }
}