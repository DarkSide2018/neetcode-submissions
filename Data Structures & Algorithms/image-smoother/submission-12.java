class Solution {
    public int[][] imageSmoother(int[][] img) {

        if(img.length == 0) return new int[0][0];


        int rLen = img.length;
        int cLen = img[0].length;

        int [][] res = new int [rLen][cLen];

        for(int row=0; row<rLen; row++){
            for(int col=0; col<cLen; col++){

                int total = 0;
                int count = 0;

                for(int mr=-1; mr<=1; mr++){
                    int rowMr = row+mr;

                    if(rowMr <0 || rowMr == rLen) continue;

                    for(int mc=-1;mc<=1;mc++){

                        int colMc = col+mc;

                        if(colMc<0 || colMc == cLen) continue;

                            int value = img[rowMr][colMc];

                            total = value+total;
                            count++;
                    }
                }
                res[row][col] = total/count;
            }
        }
        return res;
    }
}
