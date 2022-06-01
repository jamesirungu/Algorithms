class Solution {
    // loop through the array
    //increment j
    // for (int m=j;m>=0;m--)
    //if(height[m]>=height[j])
    //currentWaterHeld = Math.min(height[m],height[j])*j-(m+1);
    
    public int trap(int[] height) {
        int total=0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length]; 
        int sum=0;
        maxLeft[0]=height[0];
        maxRight[height.length-1]=height[height.length-1];
          for(int i =1;i<height.length;i++){
             maxLeft[i]=Math.max(height[i],maxLeft[i-1]);
          }
         for(int j=height.length-2;j>0;j--){
             maxRight[j]=Math.max(height[j],maxRight[j+1]);
             sum+=(Math.min(maxLeft[j],maxRight[j])-height[j]);
          }
        return sum;
    }
}