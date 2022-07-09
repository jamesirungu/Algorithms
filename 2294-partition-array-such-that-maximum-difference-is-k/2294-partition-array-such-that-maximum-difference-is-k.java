class Solution {
    public int partitionArray(int[] nums, int k) {
        /*sort the array
        1. intialize integer dp array with size nums.length
        2. initialize a counter and set it to 0
        3. at the begining we assume we have one partition unless otherwise so set counter to 1. Set the  dp[0] to nums[0]
        4. navigate through nums, for each element, find the difference with dp[i-1] and if <=k set value to dp[i-1] else set the dp[i] to nums[i]
        5. if dp[i] is set to nums[i], counter++
        6. return the counter
        */
        Arrays.sort(nums);
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-dp[i-1]<=k){
                dp[i]=dp[i-1];
                
            }
            else{
                dp[i]=nums[i];
                count++;
            }
        }
        return count;
    }
}