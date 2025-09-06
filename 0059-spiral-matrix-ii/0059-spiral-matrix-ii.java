class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1;
        int x=1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                arr[top][i]=x++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=x++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=x++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=x++;
                }
                left++;
            }
        } 
        return arr;
    }
}