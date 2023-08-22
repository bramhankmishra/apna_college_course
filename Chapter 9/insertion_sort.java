
// Perform insertion sort
import java.util.*;

public class insertion_sort {
    public static void input(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " = ");
            arr[i] = in.nextInt();
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            // insertion
            arr[previous + 1] = current;
        }
    }

    public static void output(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int[] arr = new int[size];
        input(arr);
        insertionSort(arr);
        output(arr);
    }
}