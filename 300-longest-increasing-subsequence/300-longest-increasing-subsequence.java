class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int result = 1;
        int[] dp = new int[nums.length];
        dp[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            int ans = 1;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] < nums[j]){
                    ans = Math.max(ans, 1+dp[j]);
                }
            }
            dp[i] = ans;
            result = Math.max(result, ans);
        }
        
        return result;
    }
}