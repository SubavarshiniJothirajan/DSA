class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // if middle element is greater than the rightmost element,
            // minimum must be to the right
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                // otherwise, the minimum is in the left half (including mid)
                high = mid;
            }
        }

        // at the end, low == high and points to the minimum
        return nums[low];
    }
}
