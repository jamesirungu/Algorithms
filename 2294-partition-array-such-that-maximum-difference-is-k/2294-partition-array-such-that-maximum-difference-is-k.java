class Solution {
    public int partitionArray(int[] nums, int k) {
        //sort the array
        //for every element, keep checking right with a pointer. stop the differnece >=k
        
        Arrays.sort(nums);
        int[] dp=new int[nums.length+1];
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