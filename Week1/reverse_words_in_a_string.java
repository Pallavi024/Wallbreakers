class Solution {
    
    public String reverse(String str)
    {
        String ans = "";
        for(int i=str.length() - 1;i>=0;i--)
            ans+=str.charAt(i);
        return ans;
    }
    public String reverseWords(String s) {
        
        String [] temp = s.split(" ");
        
        for(int i=0;i<temp.length;i++)
        {
            temp[i] = reverse(temp[i]);
        }
        String ans = "";
        for(int i=0;i<temp.length;i++)
            ans = ans + temp[i] + " ";
        
        return ans.substring(0,ans.length() - 1);
    }
}