class Solution {
    
    //if the prices supplied is less than 2, no need buying because there is no opportunity to sell
    //define an array to hold profit and another to hold the shares at every index during the decisions 
    // for every iteration, the profit should be changed only if selling shared gives a profit
    //if, its possible to sell at a profit, the shares should be sold
    public int maxProfit(int[] prices, int fee) {
        if(prices.length<2){
            return 0;
        }
        int profit[]=new int[prices.length];
        int shares[]=new int[prices.length];        
        shares[0]=prices[0];
        profit[0]=0;
        for(int i=1;i<prices.length;i++){
            profit[i] = Math.max(profit[i-1], prices[i]- shares[i-1] - fee);
            shares[i] = Math.min(shares[i-1], prices[i]-profit[i-1]);
            }
    
        return profit[prices.length-1];
               
    }
}