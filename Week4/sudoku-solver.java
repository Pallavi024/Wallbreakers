class Solution {
     int n = 9;
    int bd[][] = new int[n][n];
    public void solveSudoku(char[][] board) {
         for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == '.') {
                    bd[i][j] = 0;
                    continue;
                }
                bd[i][j] = Character.getNumericValue(board[i][j]);
            }
        }
        
        solve(0, 0);
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                char c = (char) (bd[i][j] + '0');
                board[i][j] = c;
            }
        }
    }
    
    private boolean solve(int row, int col) {
        if(row == n) return true;
        if(col == n) return solve(row + 1, 0);
        if(bd[row][col] != 0) return solve(row, col + 1);
        
        for(int i = 1; i < 10; i++) {
            if(isValid(i, row, col)) {
                bd[row][col] = i;
                if(solve(row, col + 1)) return true;
                bd[row][col] = 0;
            }
        }
        return false;
    }
    
    private boolean isValid(int val, int row, int col) {
        for(int j = 0; j < n; j++) {
            if(bd[row][j] == val) return false;
        }
        
        for(int i = 0; i < n; i++) {
            if(bd[i][col] == val) return false;
        }
        
        row = (row / 3) * 3;
        col = (col / 3) * 3;
        for(int i = row; i < row + 3; i++) {
            for(int j = col; j < col + 3; j++) {
                if(bd[i][j] == val) return false;
            }
        }
        
        return true;
    
}


    }
