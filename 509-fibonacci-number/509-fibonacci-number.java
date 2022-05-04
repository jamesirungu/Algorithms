class Solution {
    public int fib(int n) {
        if(n<=1)
            return n;
        int n1 = 0;
        int n2 = 1;
        int sum = n1+n2;
        for(int i=2; i<n; i++){
            n1 = n2;
            n2 = sum;
            sum = n1 + n2;
        }
        return sum;
    }
}