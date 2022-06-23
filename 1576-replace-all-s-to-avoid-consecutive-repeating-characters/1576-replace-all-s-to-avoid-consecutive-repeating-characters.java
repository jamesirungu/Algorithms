class Solution {
    public String modifyString(String s) {
        char[] strArray= s.toCharArray();
        Random rnd = new Random();
        for(int i=0; i<s.length();i++){      
            while((i-1>=0 && strArray[i-1]==strArray[i]) ||(i+1<=s.length()-1 && strArray[i]==strArray[i+1])||strArray[i]=='?')              {
                    char c = (char) ('a' + rnd.nextInt(26));
                    strArray[i]=c;                 
            }
        }
        String returnVale=String.valueOf(strArray);
        return returnVale;
    }
}
                  