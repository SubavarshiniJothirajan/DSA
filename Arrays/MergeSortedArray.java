class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r=m+n-1;
        int mid=m-1,nid=n-1;
        while(nid>=0)
        {
            if(mid>=0 && nums1[mid]>nums2[nid])
            {
                nums1[r] = nums1[mid];
                mid-=1;
            }
            else{
              nums1[r] = nums2[nid];
              nid-=1;
            }
            r-=1;
        }
    }
}
