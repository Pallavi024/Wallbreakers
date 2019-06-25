class Solution {
    public int hammingDistance(int x, int y) {
        
        int xor = x^y;
        int numberOfones = 0;
        while(xor > 0)
        {
            if(xor%2 == 1)
                numberOfones++;
            xor/=2;
        }
        return numberOfones;
    }
}