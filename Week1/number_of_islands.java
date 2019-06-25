class Solution {
    
    public void combine(char[][] grid, int i, int j){

    if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]!='1')
        return;
 
    grid[i][j]='X';
 
    combine(grid, i-1, j);
    combine(grid, i+1, j);
    combine(grid, i, j-1);
    combine(grid, i, j+1);
}
    public int numIslands(char[][] grid) {
        
    int number_of_islands=0;
    for(int i=0; i<grid.length; i++){
        for(int j=0; j<grid[i].length; j++){
            if(grid[i][j]=='1'){
                number_of_islands++;
                combine(grid, i, j);
            }
        }
    }
 
    return number_of_islands;
    }
}