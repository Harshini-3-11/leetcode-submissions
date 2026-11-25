class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        int maxlen=0;
        while(i<nums.length - 1 && j<nums.length )
        {
            maxlen=Math.max(nums[j]-nums[i],maxlen);
            i++;
            j++;
        }
        return maxlen;
        
    }
}