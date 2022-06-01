class Solution {
    public boolean canJump(int[] nums) {
        if(nums[0]>=nums.length){
                return true;
        }
       
        int reachability=0;
        boolean canJump[]=new boolean[nums.length];
        canJump[0]=true;
        for (int i=0; i< nums.length; i++){
          for(int j=0;j<i;j++){
              if(nums[j]>=i-j && canJump[j]){
                  canJump[i]=true;
              }
          }
        }
       
        return canJump[canJump.length-1];
        
    }
}