
// Write a program to perform linear_search in a program.
import java.util.*;

public class linear_search {
    public static int search( int arr[], int search){
         for (int i = 0; i<arr.length; i++){
            if(arr[i]==search){
                System.out.print("Element found at location " + (i+1));
                return (i+1);
            }

        }
        System.out.print("Element not found.");
        return 0;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for element " + (i+1)+ " = ");
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the element you want to search = ");
        int search = in.nextInt();
       search(arr,search);
    }   
}
