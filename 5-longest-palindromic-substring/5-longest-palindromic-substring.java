class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<1)
            return s;
        
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){  
            int l=i-1;
            int r=i+1;
            while( l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){        
                if(r-l > right-left){
                    right=r;
                    left=l;
                }
                l--;
                r++;
           }
           
            l=i;
            r=i+1;            
           while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){               
                if(r-l > right-left){
                    right=r;
                    left=l;
                }
               l--;
               r++;
           }
        }
        return s.substring(left,right+1);
    }
}
    