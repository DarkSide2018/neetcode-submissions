class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
       var result = mutableListOf<List<Int>>()

       val n = nums.size

       Arrays.sort(nums)

       for(i in 0..n-2){
            if(i>0 && nums[i] == nums[i-1]) continue

            var left = i+1
            var right = n-1

            while(left<right){
                val sum = nums[left] + nums[i] + nums[right]

                if(sum == 0){
                    result.add(listOf(nums[left],nums[i],nums[right]))
                    left++
                    right--

                    while(left<right && nums[left] == nums[left-1]){
                        left++
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--
                    }
                }else if(sum<0){
                    left++
                }else{
                    right--
                }
            }
       }

       return result
    }
}
