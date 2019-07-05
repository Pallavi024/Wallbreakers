import java.math.*;
class Solution {
    
    public int SumOfSquaresOfDigits(int n)
    {
        int ans = 0;
        
        while(n > 0)
        {
            ans += Math.pow(n%10,2);
            n=n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
     
        HashMap<Integer,Integer> map = new HashMap<>();
        while( n != 1 && !(map.containsKey(n)))
        {
            map.put(n,1);
            n = SumOfSquaresOfDigits(n);
           // System.out.println(n);
            
        }
        if(n == 1)
            return true;
        return false;
    }
}