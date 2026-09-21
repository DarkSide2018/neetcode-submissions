class Solution:

    def robLinear(self,start,end,nums):

        prev1=0
        prev2=0

        for i in range(start,end):
            curr = max(prev1,prev2+nums[i])
            prev2=prev1
            prev1=curr
        return prev1

    def rob(self, nums: List[int]) -> int:

        n = len(nums)

        if n == 0:
            return 0
        
        if n == 1:
            return nums[0]


        case1=self.robLinear(0,n-1,nums)
        case2=self.robLinear(1,n,nums)

        return max(case1,case2)

