class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        int start = 0, ansStart = -1, ansEnd = -1;

        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) start = i; // for Start a new subarray
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) sum = 0; // Reset if negative
        }
        return maxSum;
    }
}