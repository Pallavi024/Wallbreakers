class Solution {
    public boolean detectCapitalUse(String word) {
        
        int p = 0;
        int k = 0;
        if(word.charAt(0) >=65 && word.charAt(0) <=90)
            p = 1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i) >=65 && word.charAt(i) <=90)
                k++;
        }
        
        if(k == word.length() )
            return true;
        if(p == 1 && k == 1)
            return true;
        if(p == 0 && k==0)
            return true;
        return false;
        
    }
}