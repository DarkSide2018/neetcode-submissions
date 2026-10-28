class Solution {
    public int[][] imageSmoother(int[][] img) {
            if(img == null || img.length == 0 || img[0].length == 0){
                return new int[0][0];
            }

            int rows = img.length;
            int cols = img[0].length;

            int [][] result = new int[rows][cols];

            for(int r = 0; r<rows; r++){
                for (int c = 0; c<cols; c++){
                    int total = 0;
                    int count = 0;

                    for (int dr = -1; dr<=1; dr++){
                        int nr = r + dr; 

                        if(nr<0 || nr>= rows) continue;

                        for(int dc = -1; dc <= 1; dc ++){
                            int nc = c + dc;
                            if (nc < 0 || nc >=cols) continue;

                            total += img[nr][nc];

                            count++;
                        }
                    }

                    result[r][c] = total/count;
                }
            }
            return result;
    }
}
