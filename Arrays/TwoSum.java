class Solution {
    public int[] twoSum(int[] nums, int target) {
     int l=0,r=nums.length-1,i,sum;
     int ans[] = new int[2];
     HashMap<Integer,Integer> h = new HashMap<>();
     for(i=0;i<nums.length;i++)
     {
        sum = target-nums[i];
        if(h.containsKey(sum))
        {
            ans[0]=h.get(sum);
            ans[1]=i;
            return ans;
        }
        else
        {
            h.put(nums[i],i);
        }
     }
     return ans;
    }
    
}
