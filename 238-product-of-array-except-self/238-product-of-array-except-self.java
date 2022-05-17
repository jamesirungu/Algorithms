class Solution {
    //create an output dp array==> does not count as extra memory as in the descriptuon
    //loop through the nums array and keep the product of product until this point in every index i
    //loop backwards though nums and multiple of num from the end backwards prior to nums[i], multiply the values with what is already in output and store it in output
  
    public int[] productExceptSelf(int[] nums) {
       int[] output=new int[nums.length];
       int product=1;
       for(int i=0;i<nums.length;i++){
           output[i]=product*nums[i]; 
           product*=nums[i];
       }
    
       product=1;
       for(int i=nums.length-1;i>=0;i--){   
           if(i==0){
               output[i]=product;
           }
           else{
               output[i]=output[i-1]*product;
           }
          
          product*=nums[i];
       }
      return output;
    }
}