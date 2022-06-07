class Solution {
    //navigate to right until there you eithe get to end of the row or find a visited cell in a dp visited matrix
    //if you find either, move to the cell below
    //if you get to the cell at the bottom or find a visited cell below, move left
    //if you get to the left most possibe cell, move up
    // to ensure you dont start going to the right immediately after moving up one cell, maintain a character showing the previous direction and only move right if previous was up and the next up is marked true
    // reccursion would help calling the next move
    public List<Integer> spiralOrder(int[][] matrix) {
        return traverse(matrix,new boolean[matrix.length][matrix[0].length],0,0,new ArrayList<>(),'r');
    }
    
    public List<Integer> traverse(int[][] matrix,boolean[][] visited, int x, int y, List<Integer> path, char prevDir){
        visited[x][y]=true;
        path.add(matrix[x][y]);
        int cols=visited[0].length-1;
        int rows=visited.length-1;
        if(y<cols && visited[x][y+1]==false && !(prevDir=='u' && visited[x-1][y]==false)){
            traverse(matrix,visited,x,y+1,path,'r');
        }
        if(x<rows && visited[x+1][y]==false){
            traverse(matrix,visited,x+1,y,path,'d');
        }
        if(y>0 && visited[x][y-1]==false ){
            traverse(matrix,visited,x,y-1,path,'l');
        }
        if(x>0 && visited[x-1][y]==false){
            traverse(matrix,visited,x-1,y,path,'u');
        }
        
        return path;
        
    }
    
}