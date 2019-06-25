class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
     
        List<Integer> ans = new ArrayList<>();
        
        for(int num=left;num<=right;num++)
        {
            int p = 0;
            int N = num;
            while(N > 0)
            {
                int digit = N % 10;
                if(digit == 0 || num%digit != 0)
                {
                    p = 1;
                    break;
                }
                N = N/10;
            }
            if(p == 0)
                ans.add(num);
        }
        return ans;
    }
}