public class MaxProfit {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE,sell=0;
        for(int i=0;i<prices.length;i++){
            //find the smallest value
            buy=Math.min(buy,prices[i]);
            //compare the smallest and the largest 
            sell=Math.max(sell,prices[i]-buy);
        }
        return sell;
    }

    public static void main(String[] args)
    {
        int[] arr = {7,1,5,3,6,4};
        MaxProfit test = new MaxProfit();
        System.out.println(test.maxProfit(arr));
    }
}
