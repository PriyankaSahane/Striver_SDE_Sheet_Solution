class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the middle element is the target, return its index
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which half is sorted
            if (nums[start] <= nums[mid]) { // Left half is sorted
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; // Search in the left half
                } else {
                    start = mid + 1; // Search in the right half
                }
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; // Search in the right half
                } else {
                    end = mid - 1; // Search in the left half
                }
            }
        }
        return -1; // Target not found
    }
}
