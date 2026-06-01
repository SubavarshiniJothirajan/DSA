/*
You are given an array with unique elements of stalls[], which denote the positions of stalls. 
You are also given an integer k which denotes the number of aggressive cows.
The task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.
*/class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        
        int low = 1;
        int high = stalls[stalls.length-1]-stalls[0];
        
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(!canweplace(stalls,mid,k))
            {   
                
                high = mid-1;
                
            }
            else
            {
                low= mid+1;
            }
        }
        return high;
    }
    public static boolean canweplace(int[] arr,int dist,int cows)
    {
        int cntcows = 1,last = arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-last>=dist)
            {
                cntcows++;
                last = arr[i];
            }
        }
        return cntcows>=cows;
    }
    
}
