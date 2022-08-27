class Solution {
    public int shortestPathBinaryMatrix(int[][] g) {
        //no need to try if the first step is a 1        
        if(g[0][0]==1 ||g[g.length-1][g.length-1]==1)
            return -1;
        
        Queue<int []> nm=new LinkedList<>();
        nm.offer(new int[]{0,0,1});
        int a[][]={{0,1},{1,0},{0,-1},{-1,0},{-1,-1},{1,1},{1,-1},{-1,1}};
        while(!nm.isEmpty())
        {
            int f[]=nm.poll();
            if(f[0]==g.length-1&&f[1]==g[0].length-1)
                return f[2];
            
            for(int b[]:a)
            {
                int x=f[0]+b[0];
                int y=f[1]+b[1];
                if(x>=0 &&y>=0 && x<g.length &&y<g[0].length&&g[x][y]==0)
                {
                    nm.offer(new int[]{x,y,f[2]+1});
                    g[x][y]=1;
                }
            }
        }
        return -1;
    }
}