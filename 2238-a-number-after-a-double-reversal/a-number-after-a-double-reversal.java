class Solution {
    private int reverse(int num)
    {
        int ld,reverse=0;
        while(num!=0)
        {
           ld=num%10;
           reverse=reverse*10+ld;
           num/=10; 
        }
       return reverse;

    }
    public boolean isSameAfterReversals(int num) {
        return num==reverse(reverse(num));
    }
}