// Max_sub_arrays_sum

import java.util.*;

public class max_sub_arrays_sum {

    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " = ");
            arr[i] = in.nextInt();
        }
    }
// time complexity is O(n*n*n), which is not at all efficient, as this is brute force approach
    public static void subarray(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum_sub_array = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum_sub_array = sum_sub_array + arr[k];
                }
                if (sum_sub_array > max_sum) {
                    max_sum = sum_sub_array;
                }
                if (sum_sub_array < min_sum) {
                    min_sum = sum_sub_array;
                }
                System.out.println("| Sum = " + sum_sub_array);
            }
            System.out.print("\n");
        }
        System.out.println("The maximum sum = " + max_sum);
        System.out.println("The minimun sum = " + min_sum);
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