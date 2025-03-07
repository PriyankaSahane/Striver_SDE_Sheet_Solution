class Solution {

    // Function to build max-heap
    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;
        // Heapify from the last non-leaf node up to the root
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Heapify to maintain max-heap property
    public static void heapify(int arr[], int n, int i){

        int largest=i;
        int l= 2*i+1;
        int r= 2*i+2;

        if(l<n && arr[l]>arr[largest]){
            largest =l;
        }

        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }

        if(largest != i){
            int swap =arr[i];
            arr[i] = arr[largest];
            arr[largest]=swap;

            heapify(arr, n, largest);
        }
    }

    static int deleteRoot(int[] arr, int n, int targetPos){
        int lastElement = arr[n-1];
        arr[0]= lastElement;

        if(n==targetPos){
            return arr[n];
        }
        n=n-1;
        
        heapify(arr,n,0);
        return arr[n];
    }
    // Function to remove the root of the heap k times
    public int findKthLargest(int[] nums, int k) {
        buildMaxHeap(nums);
        int n = nums.length;

        // Remove max (root) k times
        for (int i = 0; i < k - 1; i++) {
            // Swap root with last element
            int temp = nums[0];
            nums[0] = nums[n - 1];
            nums[n - 1] = temp;

            // Reduce heap size
            n--;

            // Restore heap property
            heapify(nums, n, 0);
        }
        return nums[0]; // Kth largest element is now at the root
    }
}