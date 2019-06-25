class Solution {
    public int findComplement(int num) {
     
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(num > 0)
        {
            int k = num%2;
            if(k == 0)
                arr.add(0,1);
            else
                arr.add(0,0);
            num = num/2;
        }
        
        int n = 0;
        int k = arr.size() - 1;
        for(int i=0;i<arr.size();i++)
        {
            n += arr.get(k--)*Math.pow(2,i);
        }
        return n;
    }
}