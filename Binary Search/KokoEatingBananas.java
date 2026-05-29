class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = -1;
        for(int i=0;i<piles.length;i++)
        {
            max = Math.max(piles[i],max);
        }
        int low = 1,high = max;
        int totalhrs = 0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            totalhrs = reqHrs(piles,mid);
            if(totalhrs<=h)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static int reqHrs(int[] piles,int bannana)
    {
        int total = 0;
        for(int i=0;i<piles.length;i++)
        {
                total+=Math.ceil((double)piles[i]/(double)bannana);
        }
        return total;
    }
}
