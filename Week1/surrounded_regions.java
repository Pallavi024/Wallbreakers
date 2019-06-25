class Solution {
    
     
public void combine(char[][] board, int i, int j){
    board[i][j] = '$';
 
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
 
    for(int k=0; k<4; k++){
        int x = i+dx[k];
        int y = j+dy[k];
 
        if(x>=0 && x<board.length
          && y>=0 && y<board[0].length
          && board[x][y]=='O'){
            combine(board, x, y);
        }
    }
}   
    public void solve(char[][] board) {
     
         if(board == null || board.length==0) 
        return;
    for(int i=0;i<board.length;i++){
        if(board[i][0] == 'O'){
            combine(board, i, 0);
        }
 
        if(board[i][board[i].length-1] == 'O'){
            combine(board, i, board[i].length-1);
        }
    }

    for(int j=0; j<board[0].length; j++){
         if(board[0][j] == 'O'){
            combine(board, 0, j);
        }
 
        if(board[board.length-1][j] == 'O'){
            combine(board, board.length-1, j);
        }
    }

    for(int i=0;i<board.length;i++){
        for(int j=0; j<board[i].length; j++){
            if(board[i][j] == 'O'){
                board[i][j] = 'X';
            }else if(board[i][j] == '$'){
                board[i][j] = 'O';
            }
        }
    }
}
        
    }

