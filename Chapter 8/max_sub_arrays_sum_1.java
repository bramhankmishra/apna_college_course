
// Find the maximum sum of sub_arrays using prefix sum approach;
import java.util.*;

public class max_sub_arrays_sum_1 {
    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " = ");
            arr[i] = in.nextInt();
        }
    }

    public static void subarray(int arr[]) {
        // we'll declare a new array to store sum of sub array till the designated
        // index.
        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // To extract out all sub arrays
        for (int i = 0; i < arr.length; i++) {                                  // Here, time complexity is O(n*n).
            for (int j = i; j < arr.length; j++) {
                int curr_sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (curr_sum > max_sum) {                               
                    max_sum = curr_sum;
                }
                if (curr_sum < min_sum) {
                    min_sum = curr_sum;
                }
            }
        }
        System.out.println("The maximun sum = " + max_sum);
        System.out.println("The minimum sum = " + min_sum);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        input(arr);
        subarray(arr);
    }
}