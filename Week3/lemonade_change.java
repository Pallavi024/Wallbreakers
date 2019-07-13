class Solution {
    public boolean lemonadeChange(int[] bills) {
     
        int fivedollars = 1;
        int tendollars = 0;
        int twentydollars = 0;
        
        if(bills[0] != 5)
            return false;
        
        for(int i=1;i<bills.length;i++)
        {
            if(bills[i] == 5)
            {
                fivedollars += 1;
            }
            else if(bills[i] == 10)
            {
                if(fivedollars == 0)
                    return false;
                
                tendollars++;
                fivedollars--;
            }
            else if(bills[i] == 20)
            {
                if(fivedollars == 0)
                    return false;
                if(fivedollars < 2 && tendollars < 1)
                    return false;
                if(fivedollars == 2 && tendollars < 1)
                    return false;
                twentydollars++;
                if(tendollars != 0){
                tendollars--;
                    fivedollars-- ;
                }else
                {
                    fivedollars-=3;
                }
            }    
        }
        return true;
    }
}