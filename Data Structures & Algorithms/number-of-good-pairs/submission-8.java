class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map result = new HashMap<>();

        int len = nums.length;
        int pairs = 0;
        for(int i=0; i<len; i++){

            for(int j=0; j<len; j++){
                if(nums[i] == nums[j] && i<j){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}