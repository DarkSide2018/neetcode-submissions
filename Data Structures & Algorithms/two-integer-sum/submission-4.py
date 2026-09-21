class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = []
        n = len(nums)

        for i in range(n):
            for j in range(1,n):
                if j == i:
                    continue
                currSum = nums[i] + nums [j]
                if currSum == target:
                    result.append(i)
                    result.append(j)
                    return result

        