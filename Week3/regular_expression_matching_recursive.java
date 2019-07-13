class Solution {
    public boolean isMatch(String s, String p) {
        
        if(s.length() == 0 && p.length() == 0)
            return true;
        if(p.length() == 0)
        {
            return false;
        }
        
        if(p.length() >= 2 && p.charAt(1) == '*')
        {
            boolean smallans1 = isMatch(s,p.substring(2));
            boolean smallans2 = false; 
            if(s.length() != 0 && (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)))
            smallans2 = isMatch(s.substring(1),p);
            return smallans1 || smallans2;
        }
        if(s.length()!= 0 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'))
            return isMatch(s.substring(1),p.substring(1));
        return false;
    }
}