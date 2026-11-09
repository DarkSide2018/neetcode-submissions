class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }else{
             int original = image[sr][sc];
             fill(image,sr,sc,color,original);
        }
        return image;
    }

    public void fill(int[][] image, int sr, int sc,
     int color,
    int original){
            int rows = image.length;
            int cols = image[0].length;

            if(sr<0 || sr>=rows || sc <0 || sc >= cols){
                return;
            }
            
            if(image[sr][sc] != original){
                return;
            }

            image[sr][sc] = color;

            fill(image,sr + 1 ,sc,color,original);
            fill(image,sr - 1, sc,color,original);
            fill(image,sr,sc + 1,color,original);
            fill(image,sr,sc - 1,color,original);
    }
}