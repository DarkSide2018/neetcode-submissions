class NumArray {

    private int [] innerArray = new int [0];

    public NumArray(int[] nums) {
        this.innerArray = nums;
    }
    
    public int sumRange(int left, int right) {
        int total = 0;

        for(int i=left; i<=right; i++){
            total = total + innerArray[i];
        }

        return total;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */