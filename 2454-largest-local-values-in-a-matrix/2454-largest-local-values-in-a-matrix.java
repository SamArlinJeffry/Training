class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] ans=new int[n-2][n-2];
        for(int i=0;i<=n-3;i++){
            for(int j=0;j<=n-3;j++){
                int max=0;
                for(int h=i;h<i+3;h++){
                    for(int k=j;k<j+3;k++){
                        if(grid[h][k]>max)max=grid[h][k];
                    }
                }
                ans[i][j]=max;
            }
        }
        return ans;
    }
}