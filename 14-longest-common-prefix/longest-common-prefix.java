class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //short the array
        Arrays.sort(strs);

        //first and last string
        String first=strs[0];
        String last=strs[strs.length-1];

        String result="";

        for(int i=0;i<first.length();i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            result=result+first.charAt(i);
      
        }
        
        return result;
        
    }
}