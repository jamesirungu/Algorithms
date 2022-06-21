class Solution {
    //initialize a dp array
    //equate first value to prices[0]
    //loop through the array from index 1
    //for every price[i] compare its value with dp[i-1] and populate dp[i] with the minimum
    //maintain a maxdiff that substructs dp[i] from price[i] and updates if its max
    //return the max of the diff
    public int maxProfit(int[] prices) {  
        if(prices.length<2){
            return 0;
        }
        int dp[]= new int[prices.length];
        dp[0]=prices[0];
        int maxDiff=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            dp[i]=Math.min(prices[i],dp[i-1]);
            maxDiff=Math.max(maxDiff,prices[i]-dp[i]);
        }
        
        return maxDiff;
    }
}