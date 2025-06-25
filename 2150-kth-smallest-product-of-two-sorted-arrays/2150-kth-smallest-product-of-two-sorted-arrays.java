class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long left = -100000L * 100000L, right = 100000L * 100000L;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (countLessEqual(nums1, nums2, mid) < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private long countLessEqual(int[] nums1, int[] nums2, long target) {
        long count = 0;
        for (int a : nums1) {
            count += countPairs(a, nums2, target);
        }
        return count;
    }

    private long countPairs(int a, int[] nums2, long target) {
        int left = 0, right = nums2.length - 1;
        if (a > 0) {
            // Find the last index where a * nums2[i] <= target
            while (left <= right) {
                int mid = (left + right) / 2;
                if ((long) a * nums2[mid] <= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        } else if (a < 0) {
            // Find the first index where a * nums2[i] <= target (from the right)
            while (left <= right) {
                int mid = (left + right) / 2;
                if ((long) a * nums2[mid] <= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return nums2.length - left;
        } else {
            // a == 0 -> product is always 0
            return target >= 0 ? nums2.length : 0;
        }
    }
}
