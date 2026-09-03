class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
         String clean="";
         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                clean =clean + c;
             }
        }
            int start=0;
            int end=clean.length()-1;

           boolean palindrome=true;

           while(start<end){
            if(clean.charAt(start)!=clean.charAt(end)){
                palindrome=false;
                break;
            }
            start++;
            end--;
           }
       
        
          return palindrome;
        
    }
}