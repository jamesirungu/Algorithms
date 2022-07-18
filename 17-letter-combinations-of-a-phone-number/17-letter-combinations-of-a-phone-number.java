class Solution {
    /*
        - create a map keys 2 to 9 with their values
        - {2->['a,b,c'],3->['d,e,f'] }
        - 
    */
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return new ArrayList<>();
        }
        Map<String,String> strMap = new HashMap<>();
        strMap.put("2","abc");
        strMap.put("3","def");
        strMap.put("4","ghi");
        strMap.put("5","jkl");
        strMap.put("6","mno");
        strMap.put("7","pqrs");
        strMap.put("8","tuv");
        strMap.put("9","wxyz");
        
        List<String> returnList = new ArrayList<>();
        returnList.add("");
        for(int i=0;i<digits.length();i++){
            String str=strMap.get(digits.charAt(i)+"");
            List<String> strList = new ArrayList<>();
            for(int j=0;j<str.length();j++){  
                
                for(int k=0;k<returnList.size();k++){
                    strList.add(returnList.get(k)+str.charAt(j));                    
                }
            }            
            returnList=strList;
        }
        return returnList;   
        
    }
}