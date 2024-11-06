import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int k, j;
        for (k = nums.length - 2; k >= 0; k--) {            // O(n)
            if (nums[k] < nums[k + 1]) {
                break;
            }
        }
        // If there is no breakpoint, array is in descending order
        // Reverse to get the smallest (ascending) permutation
        if (k < 0) {
            reverse(nums, 0, nums.length - 1);
        } else {
            for (j = nums.length - 1; j > k; j--) {         // O(n)
                if (nums[j] > nums[k]) {
                    break;
                }
            }
            swap(nums, k, j);                               // O(1)
            reverse(nums, k + 1, nums.length - 1);          // O(n)
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
