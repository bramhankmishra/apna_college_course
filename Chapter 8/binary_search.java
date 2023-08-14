//Write a program to perform binary search.

import java.util.*;

public class binary_search {
    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " = ");
            arr[i] = in.nextInt();
        }
    }

    public static int binarySearch(int arr[], int search) {
        // we'll break the array into two parts in every iteration;
        int start = 0, end = (arr.length - 1);
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (arr[mid] == search) {
                System.out.print("The value is found at index = ");
                return mid;
            }

            if (arr[mid] < search) { // Go and search right side of the array
                start = mid + 1;
            }

            if (arr[mid] > search) { // Go and search right side of the array
                end = mid - 1;

            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        input(arr);
        System.out.print("Enter the number you want to search = ");
        int search = in.nextInt();
        System.out.print(binarySearch(arr, search));
    }
}