import java.util.*;

public class largest_in_array_1 {
    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element "+ (i+1)+ " = ");
            arr[i] = in.nextInt();
        }
    }

    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest  = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("The smallest value in the array = "+ smallest);
        return largest;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        input(arr);
        System.out.print("The largest value in the array = " + largest(arr));
    }
}