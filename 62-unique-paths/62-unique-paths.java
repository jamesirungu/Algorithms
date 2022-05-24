class Solution {
    public int uniquePaths(int m, int n) {
        int paths[][] = new int[m][n];
        
        for(int i=0;i<n;i++){
            paths[m-1][i]=1;
        }
        for(int i=0;i<m;i++){
            paths[i][n-1]=1;
        }
        
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                paths[i][j]=paths[i+1][j]+paths[i][j+1];
            }
        }      
        return paths[0][0];
    }    
}