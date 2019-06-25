class Solution {
    public String longestCommonPrefix(String[] strs) {
     
        if(strs.length == 0)
            return "";
        
        int min = Integer.MAX_VALUE;
        int  p =0;
        for(int i=0;i<strs.length;i++)
            min = Math.min(min,strs[i].length());
        String prefix = "";
        
        for(int i=0;i<min;i++)
        {
            char c = strs[0].charAt(i);
            for(int j = 0;j<strs.length;j++)
            {
                if(strs[j].charAt(i) != c){
                    p = 1;
                    break;
            }
               
            }
            
            if(p == 1)
                break;
             prefix += c;
        }
        return prefix;
    }
}