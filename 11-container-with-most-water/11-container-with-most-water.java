class Solution {
    public int maxArea(int[] height) {
        
        int m= height.length-1;
        int n=0;
        int maxVolume=0;
        
        while(m!=n){
            int currVolume=Math.min(height[m],height[n])*(m-n);
            maxVolume=Math.max(maxVolume,currVolume);
            if(height[m]<height[n]){
                m--;
            }
            else{
                n++;
            }
        }        
        
        return maxVolume;
        
    }
}