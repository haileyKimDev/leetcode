class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            pist = prices[i] - min;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}