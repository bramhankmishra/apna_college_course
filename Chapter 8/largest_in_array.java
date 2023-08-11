
// Find the largest number in the array
import java.util.*;

public class largest_in_array {
    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element = " + (i + 1) + " ");
            arr[i] = in.nextInt();
        }
    }

    public static int[] sort(int arr[]) {
        int var;
            for(int i =0; i< arr.length; i++){
                for(int j = i+1; j<arr.length; j++){
                    if(arr[i]<arr[j]){
                        var = arr[j];
                        arr[j] = arr[i];
                        arr[i] = var; 
                    }
                }
            }
            return arr;
    }

    public static int largest(int arr[]) { // I think best way woud be to sort an array in ascending/ descending order
                                           // and then write the last element
        sort(arr);
        return arr[0];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        input(arr);
        System.out.print("The largset number in the array = "+ largest(arr));
    }
}