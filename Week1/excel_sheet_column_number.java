class Solution {
    public int titleToNumber(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int p = 1;
        for(char i='A';i!='Z';i++)
        map.put(i,p++);
        map.put('Z',26);
        int ans = 0,k=0;
        for(int i = s.length() - 1;i>=0;i--)
        {
            ans+=map.get(s.charAt(i))*Math.pow(26,k++);
        }
        return ans;
    }
}