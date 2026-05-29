/*You are given an integer array bloomDay, an integer m and an integer k.

You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.

The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.

Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.*/
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int low = 1,high = max;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(getResult(nums,mid)<=threshold)
            {
                
                high = mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;

    }
    public static int getResult(int[] nums, int k)
    {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=Math.ceil(((double)nums[i]/k));
        }
        return sum;
    }
}
