class Solution {
    public int missingMultiple(int[] nums, int k) {
        for( int mul=k; ;mul+=k)
        {
            boolean found=false;
            
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==mul)
            {
                found=true;
                break;
            }
        }
        if(!found)
        {
            return mul;
        }
        }
    }
}