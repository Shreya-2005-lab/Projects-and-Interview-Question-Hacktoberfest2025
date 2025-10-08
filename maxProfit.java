class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int mini = prices[0];
        for(int i=1; i<prices.length; i++){
            int profit = prices[i]-mini;
            if(profit>maxProfit){
                maxProfit = profit;
            }
            if(mini>prices[i]){
                mini = prices[i];
            }
            }
        return maxProfit;
}
}
