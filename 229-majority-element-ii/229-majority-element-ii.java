class Solution {
    /*
        * requirement is to solve the problem on a O(1) space
        * n= nums.length
        * define an empty set which will contain all elements that fulfil the condition and will be return list
        * loop through nums, for every element loop backwards counting the number of ocurrences of element i and if the count satisfies condition that count> n/3, add it to the set
        *if you get a successful add to the set, break from inner loop
        * convert the set to a list and return the list  
    */
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        
       Set<Integer> dataSet = new HashSet<>();
        
        for(int i=0; i<n;i++){
            int currCount=0;
            for(int m=i;m>=0;m--){
                if(nums[i]==nums[m]){
                    currCount++;
                }
                if(currCount>n/(float)3){
                    dataSet.add(nums[i]);
                    break;
                }
            }
        }
        return new ArrayList<>(dataSet);
    }
}