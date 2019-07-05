class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String [] encoding = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> unique_words = new HashSet<String>();
        
        for(int i=0;i<words.length;i++)
        {
            String temp = "";
            for(int j=0;j<words[i].length();j++)
                temp += encoding[words[i].charAt(j) - 'a'];
            unique_words.add(temp);
        }
        return unique_words.size();
    }
}