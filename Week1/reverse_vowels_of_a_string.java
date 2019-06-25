class Solution {
    
    public boolean CheckIfVowel(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
            return true;
        return false;
    }
    public String reverseVowels(String s) {
        
        char[] temp = s.toCharArray();
        int i = 0, j = temp.length - 1;
        
        while (i < j) {
            if (CheckIfVowel(temp[i]) && CheckIfVowel(temp[j])) {
                char temp2 = temp[i];
                temp[i] = temp[j];
                temp[j] = temp2;
                i++;
                j--;
            }

            if (!CheckIfVowel(temp[i])) {
                i++;
            }

            if (!CheckIfVowel(temp[j])) {
                j--;
            }

        }
        return String.valueOf(temp);
    }
}