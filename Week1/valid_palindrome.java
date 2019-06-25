class Solution {
    public boolean isPalindrome(String s) {
        
         int startIndex = 0;
        int endIndex = s.length() - 1;
        
        while(startIndex < endIndex)
        {
            char temp1 = s.charAt(startIndex);
            char temp2 = s.charAt(endIndex);
            temp1 = Character.toLowerCase(temp1);
            temp2 = Character.toLowerCase(temp2);
            
            if(!Character.isLetterOrDigit(temp1)){
            startIndex++;
            continue;
            }
            else if(!Character.isLetterOrDigit(temp2)){
            endIndex--;
            continue;
            }
            if(temp1!= temp2)
            return false;
            startIndex++;
            endIndex--;
        }
        return true;
    }
}