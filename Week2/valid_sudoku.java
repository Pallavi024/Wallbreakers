class Solution {
    
    public boolean isValidSudoku(char[][] board,int subrow)
    {
        if(subrow >= board.length)
            return true;

        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=subrow; i < subrow + 3;i++)
        {
            for(int j= 0;j<3;j++)
            {
               if((!(((board[i][j] - '0') >=0 && (board[i][j] - '0' <=9)) || board[i][j] == '.')) || (map.containsKey(board[i][j])) )
                return false;
                if(board[i][j] != '.')
            map.put(board[i][j],1); 
            }
        }
        map.clear();
        for(int i=subrow; i < subrow + 3;i++)
        {
            for(int j= 3;j<6;j++)
            {
               if((!(((board[i][j] - '0') >=0 && (board[i][j] - '0' <=9)) || board[i][j] == '.')) || (map.containsKey(board[i][j])) )
                return false;
                if(board[i][j] != '.')
            map.put(board[i][j],1); 
            }
        }
        map.clear();
        for(int i=subrow; i < subrow + 3;i++)
        {
            for(int j= 6;j<9;j++)
            {
               if((!(((board[i][j] - '0') >=0 && (board[i][j] - '0' <=9)) || board[i][j] == '.')) || (map.containsKey(board[i][j])) )
                return false;
                if(board[i][j] != '.')
            map.put(board[i][j],1);  
            }
        }
        
        return isValidSudoku(board,subrow + 3);
    }
    public boolean isValidSudoku(char[][] board) {
     
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<board.length;i++)
        {
            for(int j = 0;j<board[i].length;j++)
            {
                if((!(((board[i][j] - '0') >=0 && (board[i][j] - '0' <=9)) || board[i][j] == '.')) || (map.containsKey(board[i][j])) )
                return false;
                if(board[i][j] != '.')
            map.put(board[i][j],1);  
            }
            map.clear();
        }
        map.clear();
         for(int j=0;j<board[0].length;j++)
        {
            for(int i = 0;i<board.length;i++)
            {
                if((!(((board[i][j] - '0') >=0 && (board[i][j] - '0' <=9)) || board[i][j] == '.')) || (map.containsKey(board[i][j])) )
                return false;
                if(board[i][j] != '.')
            map.put(board[i][j],1);  
            }
            map.clear();
        }
        return isValidSudoku(board,0);
    }
}