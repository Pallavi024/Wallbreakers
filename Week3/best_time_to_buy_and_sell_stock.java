class Solution {
    public int maxProfit(int[] prices) {
        
        int i = 0;
        int j= 1;
        int maxProfit = 0;
        while(i < prices.length && j < prices.length)
        {
            if(prices[j] > prices[i])
            {
                 int profit = prices[j] - prices[i];
                    if(profit > maxProfit)
                        maxProfit = profit;
                j++;
            }
            else
            {
                i++;
                j = i + 1;
            }
        }
        return maxProfit;
    }
}