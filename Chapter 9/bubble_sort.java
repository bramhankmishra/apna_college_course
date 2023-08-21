
// Write algorithm for bubble sort. And try to make it more optimised for already sorted array.
import java.util.*;

public class bubble_sort {
    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " =  ");
            arr[i] = in.nextInt();
        }
    }

    public static void bubble_sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) { // This loop is reponsible for number of turns the loop
            int swaps = 0;                                  // needs to run.
    // to make the code optimised for sorted array          // Explaination: This loop will run till there is only one
                                                            // element to check remaining at the end.
            for (int j = 0; j < arr.length - 1 - turn; j++) { // This loop is responsible for swapping of elements.
                                                              // This loop will run till the element which was sorted in
                                                              // the last turn.
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0 && turn!=arr.length-2){
                System.out.print("The array is already sorted ");
                break;
            }

        }
    }

    public static void output (int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int[] arr = new int[size];
        input(arr);
        bubble_sort(arr);
        output(arr);
    }
}