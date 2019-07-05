class Solution {
    public int numJewelsInStones(String J, String S) {
     
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<S.length();i++)
        {
            if(map.containsKey(S.charAt(i)))
                map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
            else
                map.put(S.charAt(i), 1);
        }
        int count = 0;
        for(int i = 0; i< J.length();i++)
        {
            if(map.containsKey(J.charAt(i)))
                count+=map.get(J.charAt(i));
        }
        return count;
    }
}