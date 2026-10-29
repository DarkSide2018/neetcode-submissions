class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if((long)m*n != original.length){
            return new int [0][0];
        }

        int[][] result = new int[m][n];

        int idx = 0;

        for (int r=0; r<m; r++){
            for(int c = 0; c<n; c++){
                result[r][c] = original[idx++];
            }
        }

        return result;
    }
}
