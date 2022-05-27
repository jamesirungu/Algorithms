/*

    - traverse the array from the last element backwords maintaining the minimum distance between the two possible routes
    - for the last tow and last column where there is only one possible route, the path = path + the adjacent cell
    
*/
class Solution {
    public int minPathSum(int[][] grid) {
        int y = grid[0].length-1;
        int x = grid.length-1;
        
        int[][] path = new int[x+1][y+1];
        path[x][y]=grid[x][y];
        for(int i=x;i>=0;i--){
            for(int j=y;j>=0;j--){
                if(i==x && j<y){
                    path[i][j]=grid[i][j]+path[i][j+1];
                }
                else if(j==y && i<x){
                    path[i][j]=grid[i][j]+path[i+1][j];
                }
                else if(i<x && j<y){
                    path[i][j]=grid[i][j]+Math.min(path[i+1][j],path[i][j+1]);
                }
                else{
                    path[i][j]=grid[i][j];
                }
            }
        }
        return path[0][0];
    }
}