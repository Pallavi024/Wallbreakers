class Solution {
    public boolean wordPattern(String pattern, String str) {
     
        HashMap<Character, String> map = new HashMap<>();
        Set <String> set = new HashSet<>();
        String [] arr = str.split(" ");
        
        if(arr.length != pattern.length())
            return false;
        
        for(int i=0;i<pattern.length();i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!(map.get(pattern.charAt(i)).equals(arr[i])))
                    return false;
            }
            map.put(pattern.charAt(i), arr[i]);
            set.add(arr[i]);
        }
        if(map.size()!= set.size())
            return false;
        return true;
    }
}