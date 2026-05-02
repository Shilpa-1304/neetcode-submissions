class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i = 0;
        ArrayList<int[]> list = new ArrayList<>();

        // Loop 1 — add intervals before newInterval
        for (; i < n && intervals[i][1] < newInterval[0]; i++) {
            list.add(intervals[i]);
        }

        // Loop 2 — merge overlapping intervals into newInterval
        for (; i < n && intervals[i][0] <= newInterval[1]; i++) {
            newInterval = new int[]{Math.min(newInterval[0], intervals[i][0]), Math.max(newInterval[1], intervals[i][1])};
        }
        list.add(newInterval);

        // Loop 3 — add remaining intervals after newInterval
        for (; i < n; i++) {
            list.add(intervals[i]);
        }

        return list.toArray(new int[list.size()][]);
    }
}