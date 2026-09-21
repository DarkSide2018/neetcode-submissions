class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);

        int keep = 0;

        int lastEnd = Integer.MIN_VALUE;

        for (int [] interval: intervals){
            if(interval[0] >= lastEnd){
                keep++;
                lastEnd = interval[1];

            }
        }

        return intervals.length - keep;
    }
}
