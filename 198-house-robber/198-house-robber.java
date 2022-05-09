class Solution {
    //declare a dp array of lenght nums.length
    //dp[0]= nums[0] 
    //dp[1]=nums[1]
    //loop through the array from index 2 to nums-1
    //values in the dp array equals nums[i]+dp[i-2] 
    //return max(dp[nums.length-1],dp[nums.length-2])
    
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}