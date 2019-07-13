class Solution {
    public List<Integer> partitionLabels(String S) {
     
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<S.length();i++)
            map.put(S.charAt(i),i);
        
        
        int k = 0, temp = 0;
        for (int i = 0; i < S.length(); ++i) {
            k = Math.max(k, map.get(S.charAt(i)));
            if (i == k) {
                ans.add(i - temp + 1);
                temp = i + 1;
            }
        }
        return ans;
    }
}