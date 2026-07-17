class Solution {
    public int mySqrt(int x) {
        
        if(x<2)
        {
            return x;
        }
        int start=1,end=x/2;
        int ans=0;
        while(start<=end)
        {
        long mid=start+(end-start)/2;

            long sqr=mid*mid;
            if(sqr==x)
            {
              return (int) mid;
            }
            if(sqr>x)
            {
                end= (int)mid-1;
            }
            else
            {
                start=(int)mid+1;
            }
            
        } 
          
         return end;
    }
}