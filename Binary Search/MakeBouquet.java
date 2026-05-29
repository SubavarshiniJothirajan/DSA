/*You are given an integer array bloomDay, an integer m and an integer k.

You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.

The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.

Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.*/
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i=0;i<bloomDay.length;i++)
        {
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }
        long val = m*1l*k*1l;
        if(val>bloomDay.length)return -1;
        int low = min, high = max;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(isPossible(bloomDay,m,k,mid))
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;

    }
    public static boolean isPossible(int[] bloomDay,int m,int k,int day)
    {
        int noofflowers = 0,cnt =0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=day)
            {
                cnt++;
            }
            else
            {
                noofflowers+=(cnt/k);
                cnt =0;
            }
        }
        noofflowers+=(cnt/k);
        return noofflowers>=m;
    }
}
