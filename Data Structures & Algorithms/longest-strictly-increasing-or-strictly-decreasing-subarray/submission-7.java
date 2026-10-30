class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int maxInc = 1, curInc = 1;
        int maxDec = 1, curDec = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]) curInc++;
            else curInc = 1;
            maxInc = Math.max(maxInc,curInc);

            if(nums[i] < nums[i-1]) curDec++;
            else curDec = 1;
            maxDec = Math.max(maxDec,curDec);
        }   
        return Math.max(maxInc,maxDec);
    }
}