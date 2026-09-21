class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        result = []
        self.backTrack(nums,target,0,[],result)
        return result

    def backTrack(self, nums:List[int], remaining: int, start:int,
        current:List[int],result: List[List[int]]) -> None:
        if remaining == 0:
            result.append(current[:])
            return
        if remaining < 0:
            return
        
        for i in range(start, len(nums)):
            current.append(nums[i])
            self.backTrack(nums, remaining - nums[i], i, current,result)
            current.pop()
        