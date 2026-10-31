class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);

        int count = 0;

        for(int i = 0; i<heights.length; i++){

// count = 0
// 1 5 2 3 4 count=1
// 1 2 5 3 4 count=2
// 1 2 3 5 4 count=3
// 1 2 3 4 5 count=4


// 1 1 4 2 1 3 count=0
// 1 1 2 4 1 3 count=1
// 1 1 2 1 4 3 count=2
// 1 1 2 1 3 4 count=3

            if(heights[i] != expected[i]){
                count++;
            }

        }
        return count;
    }
}