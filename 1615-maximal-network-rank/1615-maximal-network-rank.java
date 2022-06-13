class Solution {
    //define adjacency matrix of size n
    //populate value 1 where theres is a road between two cities
    //define another 1d array to hold number of roads touching each city
    //loop through the roads array populating the two matrices
    //loop through the spokes, for every i loop through j from j=i+1, return max of spokes[i]+spokes[j]- adjacencyMatrix[i][j]
    public int maximalNetworkRank(int n, int[][] roads) {
        int spokes[] = new int[n];
        int adjacencyMatrix[][]= new int[n][n];
        for(int i=0;i<roads.length;i++){
            adjacencyMatrix[roads[i][0]][roads[i][1]]=1;
            adjacencyMatrix[roads[i][1]][roads[i][0]]=1;
            spokes[roads[i][0]]++;
            spokes[roads[i][1]]++;
        }
        int max=0;
        for(int i=0;i<spokes.length;i++){
            for(int j=(i+1);j<n;j++){
                int curr=spokes[i]+spokes[j]-adjacencyMatrix[i][j];
                if(curr>max){
                    max=curr;
                }
            }
        }
        return max;
    }
}