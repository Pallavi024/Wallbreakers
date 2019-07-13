class Solution {
        public static int minDistance(String s1, String s2,int storage[][]){
          
      int m = s1.length();
      int n = s2.length();
      
          if(m == 0 && n == 0 )
       {
         storage[m][n] = 0;
         return storage[m][n];
       }
       
      if(m == 0)
      {
        storage[m][n] = n;
       
        return storage[m][n];
      }
      if(n == 0)
      {
        storage[m][n] = m;
        return storage[m][n];
      }
      
      if(s1.equals(s2))
      {
        storage[m][n] = 0;
        return storage[m][n];
      }
      
          if(storage[m][n] != -1)
            return storage[m][n];
          
        if(s1.charAt(0) == s2.charAt(0))
        {
          storage[m][n] = minDistance(s1.substring(1),s2.substring(1),storage);
          return storage[m][n];
        }
          
      // Delete a character
      int op1 =  1 + minDistance(s1.substring(1),s2,storage);
      //Replace a character with another one
      int op2 =  1 + minDistance(s1.substring(1),s2.substring(1),storage);
      // Insert a character
      int op3 =  1 + minDistance(s1,s2.substring(1),storage);
   
      storage[m][n] =  Math.min(op1, Math.min(op2,op3));
      
             
       
       return storage[m][n];
          
        }
	public static int minDistance(String word1, String word2){
	
    
      int m = word1.length();
      int n = word2.length();
      int storage[][] = new int [m+1][n+1];
      
      for(int i = 0 ; i<=m;i++)
      {
        for(int j=0;j<=n;j++)
          storage[i][j] = -1;
      }
      
      return minDistance(word1,word2,storage);
      }
    }
