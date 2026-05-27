class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            if(nums[i]>target)
            {
                return i;
            }
            else if(nums[i]<target && i==nums.length-1)
            {
                ans=i+1;
            }
        }
        return ans;
    }
}
