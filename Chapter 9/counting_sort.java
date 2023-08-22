
// Write counting_sort algorithm
import java.util.*;

public class counting_sort {
    public static void output(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void input(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " = ");
            arr[i] = in.nextInt();
        }
    }

    public static void countingSort(int[] arr) {
        // finding the size of auxillary array
        int size_aux_arr = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > size_aux_arr) {
                size_aux_arr = arr[i];
            }
        }
        // Finding the frequency of each element and storing it in auxillary array.
        int[] aux_arr = new int[size_aux_arr + 1];
        for (int i = 0; i < arr.length; i++) {
            aux_arr[arr[i]]++;
        }
        // storing the elements the input array in the sorted format.
        int j = 0;
        for (int i = 0; i < aux_arr.length; i++) { // We are taking the aux_arr's size as that is the array whose size
                                                   // are we concerned about.
            while (aux_arr[i] > 0) {
                arr[j] = i;
                aux_arr[i]--;
                j++;
            }
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int[] arr = new int[size];
        input(arr);
        countingSort(arr);
        output(arr);
    }
}