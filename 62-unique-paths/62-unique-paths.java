//int its only one unique way to get to the the finish line from itself.For this reason, the grid can be poulated with 1 in the last cell
//having only one way, there is only one way to access the cells on the last row and last column based on the fact that from these cells you can only move to one way
//For every cell, there are two possible moves, either to the right or to the left, so from the left bottom, second last row second last column calcuate paths[i][j]= pathc[i+1][j]+ paths[i][j+1]
//loop backwords populating values based on this formula.
//return value on cell paths[0][0]
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