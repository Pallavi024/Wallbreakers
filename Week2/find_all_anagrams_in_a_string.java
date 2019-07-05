class Solution {
    
    public boolean checkAnagram(String s,String p)
    {
        char arr[] = new char[26];
        
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i) - 'a']++;
            arr[p.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++)
        {
           if(arr[i] != 0)
               return false;
        }
        return true;
        
    }
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<=s.length() - p.length();i++)
        {
            if(checkAnagram(s.substring(i,i+p.length()),p))
                ans.add(i);   
        }
        return ans;
    }
}