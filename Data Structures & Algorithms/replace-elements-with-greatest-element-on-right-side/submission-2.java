class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = arr[n-1];
        arr[n-1] = -1;

        for(int i= n-2; i>=0; i--){
            int curr = arr[i];
            arr[i] = maxRight;
            if(curr > maxRight){
                maxRight = curr;
            }
        }

        return arr;
    }
}