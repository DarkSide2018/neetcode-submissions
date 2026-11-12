class Solution {

    //  1 2 3 3 4 5 val=3
    //  k=0 num=1 nums[0] = 1 k++;
    //  k=1 num=2 nums[1] = 2 k++;
    //  k=2 num=3 k=2;
    //  k=2 num=3 k=2;
    //  k=2 num=4 num[2] = 4 k++;
    

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int num : nums){
            if(num != val){
                nums[k] = num;
                k++;
            }
        }

        return k;
    }
}