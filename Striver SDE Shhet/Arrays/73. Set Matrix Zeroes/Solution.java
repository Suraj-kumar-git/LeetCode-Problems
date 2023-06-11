class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean[] rowZero = new boolean[row];
        boolean[] colZero = new boolean[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0 && rowZero[i] == false){
                    rowZero[i]=true;
                }
                if(matrix[i][j]==0 && colZero[j] == false) 
                    colZero[j]=true;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rowZero[i]==true){
                    setRow(matrix,i);
                }
                if(colZero[j]==true){
                    setCol(matrix,j);
                }
            }
        }
    }
    public static void setRow(int[][] matrix,int i){
        for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
        }
    }
    public static void setCol(int[][] matrix,int j){
        for(int i=0;i<matrix.length;i++){
                matrix[i][j]=0;
        }
    }
}