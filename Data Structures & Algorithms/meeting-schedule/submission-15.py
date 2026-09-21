"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        intervals.sort(key=lambda x: x.end)
        n = len(intervals)

        currLastEnd = -1
        keep = 0

        for i in range(n):
            if intervals[i].start >= currLastEnd:
                keep += 1
                currLastEnd = intervals[i].end


        if (keep - n) == 0:
            return True
        else:
            return False     
