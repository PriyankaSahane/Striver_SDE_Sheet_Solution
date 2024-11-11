import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length; // size of the array

        // Sort the intervals by the starting time
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If the list is empty or the current interval does not overlap with the last interval
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(new int[]{intervals[i][0], intervals[i][1]});
            }
            // If there is an overlap, merge the current interval with the last interval in ans
            else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            }
        }

        // Convert the list to a 2D array
        return ans.toArray(new int[ans.size()][]);
    }
}
