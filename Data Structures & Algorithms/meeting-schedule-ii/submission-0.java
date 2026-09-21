/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals == null || intervals.isEmpty()) return 0;

        intervals.sort(Comparator.comparingInt(a->a.start));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(intervals.get(0).end);

        for(int i=1; i<intervals.size(); i++){
            Interval curr = intervals.get(i);

            if(curr.start>= minHeap.peek()){
                minHeap.poll();
            }

            minHeap.add(curr.end);
        }

        return minHeap.size();
    }
}
