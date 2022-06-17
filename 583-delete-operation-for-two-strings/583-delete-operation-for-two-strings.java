class Solution {
    public int minDistance(String word1, String word2){   
        if(word1.equals(word2)){
            return 0;
        }
           
        char[] c1=word1.toCharArray();
        char[] c2=word2.toCharArray();
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        
        for(int i=1;i<c1.length+1;i++){
            for(int j=1;j<c2.length+1;j++){
                if(c1[i-1]==c2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                
            }
        }
    return c1.length-dp[c1.length][c2.length]+c2.length-dp[c1.length][c2.length];
    }
}