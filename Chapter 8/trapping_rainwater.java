
// trapping_rainwater
import java.util.*;

public class trapping_rainwater {
    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " = ");
            arr[i] = in.nextInt();
        }
    }

    public static int rainwater(int height[]) {
        int trapped_water = 0;

        // Calculating leftmax boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Calculating rightmax boundary
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // Calculating water level
        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapped_water += (waterlevel - height[i]);
        }
        // Calculating trapped water
        return trapped_water;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        input(arr);
        System.out.println(rainwater(arr));
    }
}