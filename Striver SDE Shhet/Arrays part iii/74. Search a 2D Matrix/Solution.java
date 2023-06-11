class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length,cols=matrix[0].length,low=0;
        int high=(rows*cols)-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int row=mid/cols;
            int col=mid%cols;
            if(matrix[row][col]== target) return true;
            else if(matrix[row][col]< target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}