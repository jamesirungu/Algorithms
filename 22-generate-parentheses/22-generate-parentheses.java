class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();
        dfs(ls,"",0,0,n);
        return ls;
    }
    
    public void dfs(List<String> ls,String current, int openBrace, int endBrace, int n){
        if(current.length()==n*2){
            ls.add(current);
            return;
        }
        if(openBrace<n)
            dfs(ls,current+"(",openBrace+1,endBrace,n);
        if(endBrace<openBrace)
            dfs(ls,current+")",openBrace,endBrace+1,n);
    }
}