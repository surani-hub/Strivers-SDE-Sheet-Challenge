import java.util.ArrayList;
import java.util.Arrays;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>(Arrays.asList(2, 100, 150, 120));

        System.out.println(maximumProfit(prices));
    }

    public static int maximumProfit(ArrayList<Integer> prices) {
        // Write your code here.
        int maxProfit = 0;
        int minBuy = prices.get(0);
        for (int i = 0; i < prices.size(); i++) {
            minBuy = Math.min(minBuy, prices.get(i));
            maxProfit = Math.max(maxProfit, prices.get(i) - minBuy);
        }
        return maxProfit;
    }
}
