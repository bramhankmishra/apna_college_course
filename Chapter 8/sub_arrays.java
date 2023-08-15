
// printing all sub arrays
import java.util.*;

public class sub_arrays {

    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " = ");
            arr[i] = in.nextInt();
        }
    }

    public static void max_min_sum(int sum_arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < sum_arr.length; i++) {
            if (sum_arr[i] > max) {
                max = sum_arr[i];
            }
            if (sum_arr[i] < min) {
                min = sum_arr[i];
            }
        }
        System.out.println("The maximum sum of sub-arrays = " + max);
        System.out.println("The minimum sum of sub-arrays = " + min);       // I am so happy to write this on my own
    }

    public static void subarr(int arr[]) {
        int sum_arr[] = new int[(arr.length * (arr.length + 1)) / 2];
        int unwtd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " "); // We can calculate the sum in every sub array.
                    sum = sum + arr[k];
                }
                System.out.print(" | Sum = " + sum);
                sum_arr[unwtd] = sum;
                unwtd++;
                System.out.print("\n");

            }
            System.out.print("\n");
        }
        max_min_sum(sum_arr);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        input(arr);
        subarr(arr);
    }
}