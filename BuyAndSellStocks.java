import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class BuyAndSellStocks{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min = prices.get(0);
        int profit = 0;
        int cost;
        int n = prices.size();
        for(int i = 1; i < n; i++){
            cost = prices.get(i) - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices.get(i));
        }
        return profit;
    }
}
