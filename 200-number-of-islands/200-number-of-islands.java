
class Solution {
    int [][] directions ={{0,1},{0,-1},{-1,0},{1,0}};
    public int numIslands(char[][] grid) {
        // Create a queue to store the next explorable location
        //for every visited element, push to a queue
        //while queue is not empty, pop out an element and navigate around it
        //mark visited elements as 0
        int numberOfIslands=0;
        if(grid==null|| grid.length==0){
            return numberOfIslands;
        }
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    numberOfIslands++;
                }
            }
        } 
        
        return numberOfIslands;        
    }
        public void bfs(char[][] grid, int row, int col){
            Queue<int[]> islandsQueue=new LinkedList<>();
             islandsQueue.add(new int[]{row,col});
            
            grid[row][col]='0';
            
            while(islandsQueue.size()>0){
                int[] currElement=islandsQueue.poll();
                   // int currentRow=currElement[0];
                 //   int currentCol=currElement[1];
                 for(int[] currentDirection:directions){
                    int currentRow=currentDirection[0]+currElement[0];
                    int currentCol=currentDirection[1]+currElement[1];    
                     
                if(currentRow<0 || currentRow> grid.length-1 || currentCol<0 || currentCol>grid[row].length-1){
                        continue;
                    }
                        if(grid[currentRow][currentCol]=='1'){
                            grid[currentRow][currentCol]='0';
                            islandsQueue.add(new int[]{currentRow,currentCol});
                        }
                    }
                 }
            }   
    }
    
