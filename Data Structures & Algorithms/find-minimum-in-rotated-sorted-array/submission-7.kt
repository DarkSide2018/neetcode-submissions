class Solution {
    fun findMin(nums: IntArray): Int {
        if(nums == null || nums.size == 0) return 0

        var left = 0
        var right = nums.size -1
        while(left<right){
            var mid = left + (right-left)/2

            if(nums[mid]>nums[right]){
                left = mid+1
            }
            if(nums[mid] < nums[right]){
                right = mid
            }
        }

        return nums[left]
    }
}
