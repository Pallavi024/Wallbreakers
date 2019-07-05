class Solution {
    public char findTheDifference(String s, String t) {
     
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++)
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0) + 1);
        for(int i=0;i<s.length();i++)
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) - 1);
        for(Map.Entry<Character,Integer> entry : map.entrySet())
            if(entry.getValue() == 1)
                return entry.getKey();
        return 0;
                
    }
}