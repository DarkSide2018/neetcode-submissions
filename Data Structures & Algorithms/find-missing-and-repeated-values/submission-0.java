class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n*n;

        int [] freq = new int [total+1];

        for(int[]row: grid){
            for(int val : row){
                freq[val]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        for(int v=1;v<=total; v++){
            if(freq[v] == 2){
                repeated = v;
            }else if(freq[v] == 0){
                missing = v;
            }
        }
        return new int[]{repeated,missing};
    }
}