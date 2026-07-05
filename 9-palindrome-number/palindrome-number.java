class Solution {
    public boolean isPalindrome(int x) {
        int x1=x;int reverse=0;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
           int ld=x%10;
            reverse=reverse*10+ld;
            x/=10; 
        }
        x=x1;
        return reverse==x;
        }

    }
