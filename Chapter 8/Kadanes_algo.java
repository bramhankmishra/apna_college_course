
// Fiding max_sum_subarray Kadane's Algorithm
import java.util.*;

public class Kadanes_algo {
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
        for (int i = 0; i < arr.length; i++) { // Here, time complexity is O(n*n).
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

    public static void Kadane(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int temp = 0;
        // we know that this algorithm won't work with an array with all negative
        // numbers so we can check first for that condition.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp++;
            }
        }

        if (temp > 0) {
            for (int i = 0; i < arr.length; i++) {
                curr_sum = curr_sum + arr[i]; // This won't give result for array with all the negative values.
                if (curr_sum < 0) {
                    curr_sum = 0; // Here, time complexity is O(n).
                }
                max_sum = Math.max(max_sum, curr_sum);
            }
            System.out.println("The maximum subarray sum  = " + max_sum);
        } else {
            subarray(arr);
        }

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        input(arr);
        Kadane(arr);
    }
}
