
// Find the sum of primary and secondary diagonal
import java.util.*;

public class sum_diagonal {
    public static void input(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            Scanner in = new Scanner(System.in);
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Enter the element in rows " + (i + 1) + " colunmn " + (j + 1) + " = ");
                arr[i][j] = in.nextInt();
            }
        }
    }

    public static void output(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    // This method has complexity of O(n^2)
    // public static void diagonal_sum(int[][] arr) {
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // if (i == j) {
    // sum += arr[i][j];
    // }
    // if (i + j == arr.length - 1) {
    // if (i == j) {
    // continue;
    // } else
    // sum += arr[i][j];
    // }
    // }
    // }
    // System.out.print("The sum of primary and seconday diagonal = " + sum);
    // }

    // This method has complexity of O(n)
    public static void diagonal_sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            // for primary diagonal;
            sum += arr[i][i];

            // for secondary diagonal
            if (i != arr.length - 1 - i) {
                sum += arr[i][arr.length - 1 - i];
            }
        }
        System.out.print("The sum of primary and seconday diagonal = " + sum);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns = ");
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];
        input(arr);
        output(arr);
        if (rows == cols) {
            diagonal_sum(arr);
        } else
            System.out.print("Wrong Input");
    }
}