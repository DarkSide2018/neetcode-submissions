class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList();

    
        Arrays.sort(intervals,Comparator.comparingInt(a -> a[0]));
    
        int currStart = intervals[0][0];
        int currEnd = intervals[0][1];
        int [] currInterval = new int [] {currStart, currEnd};

        for (int [] interval:intervals){

            if(interval[0] > currEnd){

                result.add(currInterval);

                currStart = interval[0];
                currEnd = interval[1];

            } else {
                if(interval[1] > currEnd){
                    currEnd = interval[1];
                }
                if(interval[0] < currStart){
                    currStart = interval[0];
                }

            }
            currInterval = new int [] {currStart, currEnd};
        }

        result.add(currInterval);

        return result.toArray(new int[result.size()][]);
    }
}
