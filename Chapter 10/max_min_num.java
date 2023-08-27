import java.util.*;

public class max_min_num {
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
public static void max(int[][] arr){
    int max = Integer.MIN_VALUE;
    for(int  i = 0; i<arr.length;i++){
        for(int  j = 0; j<arr[0].length; j++){
            if(arr[i][j]>max){
                max = arr[i][j];
            }
        }
    }
    System.out.println("The maximum number in the array = "+ max);
}
public static void min(int[][] arr){
    int min = Integer.MAX_VALUE;
    for(int  i = 0; i<arr.length;i++){
        for(int  j = 0; j<arr[0].length; j++){
            if(arr[i][j]<min){
                min = arr[i][j];
            }
        }
    }
    System.out.println("The maximum number in the array = "+ min);
}
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns = ");
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];
        input(arr);
        max(arr);
        min(arr);
    }
}