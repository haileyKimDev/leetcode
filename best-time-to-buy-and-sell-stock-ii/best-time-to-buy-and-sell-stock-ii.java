class Solution {
  public int maxProfit(int[] prices) {
    int profit = 0;
    for(int i = 1 ; i < prices.length; i++){
      int currentProfit = prices[i]-prices[i-1];
      if(currentProfit > 0){
        profit+=currentProfit;
      }
    }
    return profit;
  }
}