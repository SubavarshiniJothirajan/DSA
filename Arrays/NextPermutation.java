class Solution {
    public void nextPermutation(int[] nums) {
        int i,idx=-1;
        for(i=nums.length-2;i>=0;i--)//longest prefix 
        {
            if(nums[i]<nums[i+1])
            {
                idx = i;
                break;
            }
        }
        if(idx==-1)
        {
            Solution.reverse(nums);
            return;
        }
        for(i=nums.length-1;i>=0;i--)//finding next largest element 
        {
            if(nums[i]>nums[idx])
            {
                int t = nums[i];
                nums[i] = nums[idx];
                nums[idx] = t;
                break;
            }
        }
        Solution.reverse(nums,idx+1);


    }
    public static void reverse(int[] nums)
    {
        int i=0,j=nums.length-1;
        while(i<j)
        {
            int t = nums[i];
            nums[i]=nums[j];
            nums[j] = t;
            i++;j--;
        }
    }
    public static void reverse(int[] nums,int idx)
    {
        int i=idx,j=nums.length-1;
        while(i<j)
        {
            int t = nums[i];
            nums[i]=nums[j];
            nums[j] = t;
            i++;j--;
        }
    }
}
