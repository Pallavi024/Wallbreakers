class Solution {
    public int binaryGap(int N) {
     
        ArrayList<Integer> arr = new ArrayList<>();
        int k = 1;
        while(N > 0)
        {
            if(N%2 == 1)
              arr.add(k);
            N = N/2;
            k++;
        }
        int diff = 0;
        for(int i = 0;i<arr.size() - 1;i++)
            diff = Math.max(diff,arr.get(i + 1) - arr.get(i));
    
        return diff;
    }
}