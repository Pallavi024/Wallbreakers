class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() == 0)
            return true;
        if( t.length() == 0)
            return false;
        int i = 0;
        int count = 0;
        for(int j=0;j<t.length();j++)
        {
            if(i < s.length() && s.charAt(i) == t.charAt(j))
            {
                i++;
                count++;
            }
        }
        if(count == s.length())
            return true;
        else
            return false;
    }
}