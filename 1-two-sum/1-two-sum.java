class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(indexMap.containsKey(target-nums[i])){
                return new int[]{indexMap.get(target-nums[i]),i};
            }
            else{
            indexMap.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}