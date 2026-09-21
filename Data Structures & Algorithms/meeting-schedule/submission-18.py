"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        if len(intervals) == 0:
            return True

        intervals_sorted = sorted(intervals,key=lambda i: i.start)

        current_index = 0
        current_end = intervals_sorted[0].end
        for i in intervals_sorted:
            if current_index == 0:
                current_index = current_index+1
                continue
            if i.start < current_end:
                return False
            else:
                 current_end = i.end
            current_index = current_index+1
        return True
