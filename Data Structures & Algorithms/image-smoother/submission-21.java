class Solution {
    public int[][] imageSmoother(int[][] img) {

        if(img.length == 0 || img[0].length == 0){

            return new int [0][0];
        }

        int row = img.length;
        int col = img[0].length;
        int[][] res = new int [row][col];
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int total = 0;
                int count = 0;

                for(int drow = -1; drow<2; drow++){
                    int idrow=drow+i;
                    if(idrow < 0 || idrow>=row) continue;

                    for(int dcol=-1; dcol<2; dcol++){
                        int idcol=dcol+j;
                        if(idcol < 0 || idcol>=col) continue;

                        total = total + img[idrow][idcol];
                        count++;

                    }
                }
                res[i][j] = total/count;
            }
        }
        return res;
    }
}
