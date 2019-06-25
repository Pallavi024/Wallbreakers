class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
         
        for(int i=0;i<A.length;i++)
        {
         int j = 0;
         int k = A[i].length - 1;
            while(j <= k)
            {
             int temp = A[i][j];
             A[i][j] = A[i][k];
             A[i][k] = temp; 
                
                if(A[i][j] == 1)
                    A[i][j] = 0;
                else
                    A[i][j] = 1;
                if(j != k){
                 if(A[i][k] == 1)
                    A[i][k] = 0;
                else
                    A[i][k] = 1;
                }
                j++;
                k--;
            }
        }
       
        return A;
    }
}