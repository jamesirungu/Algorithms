class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
            k++;
        }
        for(int j=0;j<nums2.length;j++){
            arr[k]=nums2[j];
            k++;
        }
        
        Arrays.sort(arr);
        
        boolean isEven = arr.length%2==0?true:false;
        
        
        //[1,2], nums2 = [3,4]
        //1,2,3,4
        if(isEven==true){
            return (arr[(arr.length/2)-1 ]+arr[arr.length/2])/(double)2;
        }
       
        return arr[arr.length/2];
        
    }
}