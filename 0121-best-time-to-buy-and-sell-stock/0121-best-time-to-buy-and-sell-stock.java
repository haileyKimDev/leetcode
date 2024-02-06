class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int op = 0;// overall profit
        int pist = 0;// profit if sold today
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){//more smaller then previous one
                min = prices[i];// update our least so far
            }
            pist = prices[i] - min;// calculating profit if sold today by, Buy - sell
            if(op < pist){//more then our previous overall profit
                op = pist;
            }
        }
        return op;
    }
}