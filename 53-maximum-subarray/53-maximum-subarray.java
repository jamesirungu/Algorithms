//declare another dp array

//equate the value of dp[0] to existing nums[0]

//declare a variable max that would hold the reslult and assign its value to minimum possible integer

//Loop through the nums array, for each element, compare its value with sum of its dp[i-1] and assign the higher value to dp[i]

//if the value gotten is bigger than existing max, assign max to the dp[i] else retain max as is.

//return max after the loop

class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}