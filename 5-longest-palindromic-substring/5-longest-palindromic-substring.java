class Solution {
    //if the string size is less than 1(null), return the input
    //loop through the string 
    //at every index, check whether the value on left and value on right are equal to know if the odd number parindrome scenario exist
    //if it does, and the right - left is less than r -l , replace right with current r and replace left with current left
    //decrement left and increment right pointers and loop again
    //end of loop is when l<0 or r >s.length-1
    //Next is to check the scenario where palindrome might happend due to repeated characters eg bb
    //do a similar loop but in initiate value of l to i and r = i+1 and compare then repeat the decrement for l and increment for r comparing to right - left to know if there is a need to update left and right
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
    