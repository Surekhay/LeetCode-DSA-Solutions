class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                   
                    count++;
                     if(nums[j]==1){
                        continue;
                    }
                }

            }
             if(count==1)
             {
              return nums[i];
             }
        }
       
          return -1;
    }
}