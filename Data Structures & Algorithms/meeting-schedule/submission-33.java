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
    public boolean canAttendMeetings(List<Interval> intervals) {

        if(intervals.isEmpty()){
            return true;
        }

        int n = intervals.size();

        Collections.sort(intervals,Comparator.comparingInt(iv->iv.start));

        Interval current = intervals.get(0);

        for(int i=1; i<n; i++){
            if(current.end > intervals.get(i).start){
                return false;
            }else{
                current = intervals.get(i);
            }
        }

        return true;
    }
}
