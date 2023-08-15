
// Reverse_array
import java.util.*;

public class Reverse_array {

    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " = ");
            arr[i] = in.nextInt();
        }
    }

    public static void output(int arr[]) {
        System.out.print("Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            // swapping array
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            // updating the index of array
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        input(arr);
        reverse(arr);
        output(arr);
    }
}