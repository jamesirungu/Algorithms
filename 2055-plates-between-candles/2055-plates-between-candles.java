class Solution {
    //create a dp array to store the location of a candle on the left hand side at every character of a string
    //create another dp array to store the location of the candle on the right side of an element.
    //left or right could be its position
    //the number of plates should be left candle location of queries[i][1]- right candle location of queries[i][0] - number cundles in between
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int[] returnValues= new int[queries.length];
        
        int[] dp = new int[s.length()+1];     
        int[] dpRight = new int[s.length()+1]; 
        int[] countOfCandles = new int[s.length()];
        dpRight[s.length()]=s.length()-2;
        if(s.charAt(0)=='|'){
             countOfCandles[0]=1;           
        }
        for(int i=1;i<s.length();i++){               
            if(s.charAt(i)=='|'){
                dp[i]=i;
                countOfCandles[i]=countOfCandles[(i-1)]+1;
            }
            else{
                countOfCandles[i]=countOfCandles[(i-1)];
                dp[i]=dp[i-1];
            }    
            
        }
        
        
        for( int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='|'){
                dpRight[i]=i;
            }
            else{
                dpRight[i]=dpRight[i+1];
            }
            
        }       
        
        for(int i=0;i<queries.length;i++){
            int coundlesCount=countOfCandles[dp[queries[i][1]]]-countOfCandles[dpRight[queries[i][0]]];
            int currDiff=dp[queries[i][1]]-dpRight[queries[i][0]]-coundlesCount;
            if(currDiff<0){
                currDiff=0;
            }
            returnValues[i]= currDiff;
        }
        
        return returnValues;
    }
    
}