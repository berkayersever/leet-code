class Search-a-2D-Matrix-II.java {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = 0, row = matrix.length - 1;
        
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target)
                row--;
            else if (matrix[row][col] < target)
                col++;
            else
                return true;
        }
        return false;
    }
}
