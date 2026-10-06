class Solution {
    public int maxDistance(int[] position, int m) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Arrays.sort(position);
        max = position[position.length-1]-position[0];
        for(int i=0;i<position.length;i++)
        {
            min = Math.min(min,position[i]);
            
        }
        int low = 1,high = max;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(canPlace(position,mid)>=m)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return high;

    }
    public static int canPlace(int[] position,int dist)
    {
        int cnt =1;
        int placed = position[0];
        for(int i=1;i<position.length;i++)
        {
            int d = Math.abs(placed-position[i]);
            if(d>=dist)
            {
                cnt++;
                placed = position[i];
            }

        }
        return cnt;
    }
}