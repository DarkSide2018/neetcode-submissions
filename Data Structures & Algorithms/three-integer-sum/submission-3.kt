class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
         val result = mutableListOf<List<Int>>()

         val numsLength = nums.size

         Arrays.sort(nums)

         for(i in 0..numsLength-2){
            if(i>0 && nums[i] == nums[i-1]) continue;

            var left = i+1;
            var right = numsLength-1;

            while(left<right){
                val sum = nums[left] + nums[i] + nums[right];

                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[right],nums[left]))
                    left++
                    right--
                    while (left<right && nums[left] == nums[left-1]){
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
