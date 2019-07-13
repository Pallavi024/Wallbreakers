class Solution {
    public double myPow(double x, int n) {
        
        double ans = x;
        if(x == 0)
            return 0;
        if(n == 0)
            return 1;
        if(n == 1)
            return x;
        if(n == -1)
            return (1/x);
        double smallans;  
    if(n == 0)  
        return 1;  
    smallans = myPow(x, n / 2);  
    if (n % 2 == 0)  
        return smallans * smallans;  
    else
    {  
        if(n > 0)  
            return x * smallans * smallans;  
        else
            return (smallans * smallans) / x;  
    }  
    }
}