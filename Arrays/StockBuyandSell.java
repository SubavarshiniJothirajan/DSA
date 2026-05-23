class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int j=0;j<prices.length;j++)
        {
            if(prices[j]<buy)
            {

                buy = prices[j];
            }
            else if(prices[j]-buy>profit)
            {
                profit = prices[j]-buy;
            }
        }
        return profit;
    }
}
