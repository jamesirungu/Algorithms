import java.math.BigInteger;
class Solution {
    public int myAtoi(String s) {
        if(s==null || s.equals("")){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int positivity=1;
        for(int i=0; i<s.length();i++){        
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ' &&  s.charAt(i)!='+' &&  s.charAt(i)!='-'){ 
                break;
            }   
            if(s.charAt(i)=='.'){ 
                break;
            } 
            if(i<s.length()-1){
                if(s.charAt(i)=='-' && s.charAt(i+1)=='+' || s.charAt(i)=='-' && s.charAt(i+1)=='-' || s.charAt(i)=='+' && s.charAt(i+1)=='+' || s.charAt(i)=='+' && s.charAt(i+1)=='-'){
                    break;
                }
            }
            if(i<s.length()-1){
                if((s.charAt(i)=='-'|| s.charAt(i)=='+') && s.charAt(i+1)==' '){
                    break;
                }
            }
            if(i>0){
                if(s.charAt(i)==' ' && i>0 && s.charAt(i-1)!=' ' && s.charAt(i-1)!='+' && s.charAt(i-1)!='-' ){
                    break;
                }
            }            
            if(i>0 && s.charAt(i-1)!=' ' && (s.charAt(i)=='-' || s.charAt(i)=='+')){
                break;
            }
            if(s.charAt(i)==' ' || s.charAt(i)=='+'){
                continue;
            }
            
            
            if(s.charAt(i)=='-' && positivity==1){
                positivity=-1;
                continue;
            }
            else if(s.charAt(i)=='-' && positivity==-1){
                positivity=1;
                continue; 
            }
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            
        }
        if(sb.toString().equals("")){
            return 0;
        }
       BigInteger currLong= new BigInteger(sb.toString().trim());
           if(currLong.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))>0 && positivity==1){
            return Integer.MAX_VALUE;
        }
        if(currLong.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))>0 && positivity==-1){
            return Integer.MIN_VALUE;
        }
        return positivity*Integer.parseInt(sb.toString().trim());                
    }
}