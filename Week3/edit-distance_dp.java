class Solution {
    public int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
      int storage[][] = new int [m+1][n+1];
      for(int i =0;i<=m;i++)
      {
        storage[i][0] = i;
      }
      for(int i =0;i<=n;i++)
      {
        storage[0][i] = i;
      }
      
      for(int i=1;i<=m;i++)
      {
        for(int j=1;j<=n;j++){
          
         if(s1.charAt(i - 1) == s2.charAt(j - 1))
      {
        storage[i][j] = storage[i-1][j-1];
      }
      else {
      // Delete a character
      int op1 =  1 + storage[i-1][j];
      //Replace a character with another one
      int op2 =  1 + storage[i-1][j - 1];
      // Insert a character
      int op3 =  1 + storage[i][j - 1];
   
      storage[i][j] =  Math.min(op1, Math.min(op2,op3));
        }
        }
      }
      
      return storage[m][n];
    }
}