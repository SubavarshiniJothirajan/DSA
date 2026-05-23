class Solution {
    public void rotate(int[][] matrix) {
        int i,j;
        //transpose
        for(i=0;i<matrix.length;i++)
        {
            for(j=i+1;j<matrix[0].length;j++)
            {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        for(i=0;i<matrix.length;i++)
        {
            int l = 0,r=matrix[i].length-1;
            while(l<r)
            {
                 int t = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = t;
                l++;
                r--;
            }
        }
    }
}
