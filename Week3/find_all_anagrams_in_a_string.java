class Solution {
    
    public boolean checkAnagram(String s,String t)
    {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s = String.valueOf(arr1);
        t = String.valueOf(arr2);
        if(s.equals(t))
            return true;
        return false;
        
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