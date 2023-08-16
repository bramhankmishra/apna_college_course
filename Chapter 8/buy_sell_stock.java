
// Time to buy and sell the stocks
import java.util.*;

public class buy_sell_stock {
    public static int prices(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        // calculate the least possible buying price.
        for(int i = 0; i< prices.length; i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value in element " + (i + 1) + " = ");
             arr[i] = in.nextInt();

        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = in.nextInt();
        int arr[] = new int[size];
        input(arr);
        System.out.print("The maximun profit = " + prices(arr));
    }
}