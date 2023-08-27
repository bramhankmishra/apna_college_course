
// Write a code to print spiral matrix from a 2D array.
import java.util.*;

public class spiral_matrix {
    public static void input(int[][] arr) {
        // for rows
        for (int i = 0; i < arr.length; i++) {
            Scanner in = new Scanner(System.in);
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Enter the element in rows " + (i + 1) + " colunmn " + (j + 1) + " = ");
                arr[i][j] = in.nextInt();
            }
        }
    }

    public static void spiral(int[][] arr) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // top row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            startRow++;
            // right col
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--;
            // bottom row
            for (int i = endCol; i >= startCol; i--) {
                System.out.print(arr[endRow][i] + " ");
            }
            endRow--;
            // left col
            for (int i = endRow; i >= startRow; i--) {
                System.out.print(arr[i][startCol] + " ");
            }
            startCol++;
            // updation
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

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns = ");
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];
        input(arr);
        output(arr);
        spiral(arr);
    }
}