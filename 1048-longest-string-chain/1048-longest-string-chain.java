class Solution {
    public int longestStrChain(String[] words) {

        Arrays.sort(words,(String s1, String s2) -> s1.length() - s2.length());
        Map<String,Integer> map = new HashMap<>();        
        int maxSize=0;
        for(int i=0;i<words.length;i++){  
            int count=0;
            String currStr=words[i];
            for(int j=0;j<currStr.length();j++){
                String modifiedString=currStr.substring(0,j)+currStr.substring(j+1);
                if( map.containsKey(modifiedString)){                    
                    count=Math.max(map.get(modifiedString),count);
                    
                }
                
                
                
            }
            if(currStr!=null){
                    map.put(currStr,count+1);
                }
            
        }
       
        Set<String> set =map.keySet();
        for(String k: set){
            maxSize=Math.max(maxSize,map.get(k));
        }
        
        return maxSize;
    }
}