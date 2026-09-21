class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums_sorted = sorted(nums)
        current_num = None
        for num in nums_sorted:
            if current_num == num:
                return True
            else:
                current_num = num
        return False
        