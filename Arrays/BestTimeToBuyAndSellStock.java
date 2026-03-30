/**
 * Problem: Best Time to Buy and Sell Stock
 * Approach: Greedy (Track Minimum Price)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int bestBuy = prices[0];   // minimum price so far
        int maxProfit = 0;         // maximum profit

        for (int i = 0; i < prices.length; i++) {
            bestBuy = Math.min(bestBuy, prices[i]); // update buy
            int profit = prices[i] - bestBuy;       // calculate profit
            maxProfit = Math.max(maxProfit, profit); // update max profit
        }

        return maxProfit;
    }
}
