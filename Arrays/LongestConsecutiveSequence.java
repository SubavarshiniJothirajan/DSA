class Solution {
    public int longestConsecutive(int[] nums) {
     int lastSmallest = Integer.MIN_VALUE;
     int cnt = 0;
     int longest = 1;
     Arrays.sort(nums);
     if(nums.length==0)
        return 0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]-1==lastSmallest)
        {
            cnt++;
            lastSmallest = nums[i];
        }
        else if(lastSmallest!=nums[i])
        {
            cnt = 1;
            lastSmallest = nums[i];
        }
        longest = Math.max(longest,cnt);
     }
     return longest;
    }
    
}
