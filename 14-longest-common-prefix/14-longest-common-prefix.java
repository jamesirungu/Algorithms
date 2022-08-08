class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs.length==0 || strs==null){
           return "";
       }              
       int maxSize=0;
        for(int i=0;i<strs[0].length();i++){
            char m=strs[0].charAt(i);
            int count=0;
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()-1<i){
                    break;
                }
                if(strs[j].charAt(i)==m){
                    count++;
                }
            }
            if(count==strs.length-1){
                maxSize++;
            }
            else{
                break;
            }
        }
        return strs[0].substring(0,maxSize);
    }
}