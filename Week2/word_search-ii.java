class TrieNode{
    
    TrieNode []children;
    boolean isTerminating;
    char data;
    public TrieNode(char data)
    {
        children = new TrieNode[26];
        isTerminating = false;
        this.data  =  data;
    }
}
class Trie {

    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
         root = new TrieNode('\0');
    }
    
    /** Inserts a word into the trie. */
    
    public void insert(TrieNode root, String word)
    {
        
        if(word.length() == 0)
        {
            root.isTerminating = true;
            return;
        }
        
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null)
        {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
        }
        insert(child,word.substring(1));
    }
    public void insert(String word) {
        
        insert(root, word);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(TrieNode root, String word)
    {
        if(word.length()==0)
        {
            if(root.isTerminating)
                return true;
            else
                return false;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null)
        {
            return false;
        }
        if(child.data != word.charAt(0))
            return false;

        return search(child,word.substring(1));
        
    }
    public boolean search(String word) {
     
        return search(root, word);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    
    public boolean startsWith(TrieNode root, String word)
    {
         if(word.length() == 0)
        {
            return true;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null)
        {
            return false;
        }
        if(child.data == word.charAt(0))
            return startsWith(child,word.substring(1));;

        return false;
    }
    public boolean startsWith(String prefix) {
     return startsWith(root, prefix);
    }
}

public class Solution {
    Set<String> set = new HashSet<String>(); 
 
    public List<String> findWords(char[][] board, String[] words) {
         
        Trie trie = new Trie();
        for(int i=0;i<words.length;i++)
            trie.insert(words[i]);
        
 
        int rows=board.length;
        int cols=board[0].length;
 
        boolean[][] visited = new boolean[rows][cols];
 
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
               findWords(board, visited, "", i, j, trie);
            }
        }
 
        ArrayList<String> ans = new ArrayList<>();
    for(String temp : set)
        ans.add(temp);
    return ans;
    }
 
    public void findWords(char[][] board, boolean[][] visited, String temp, int i, int j, Trie trie){
        int rows=board.length;
        int cols=board[0].length;
 
        if(i<0 || j<0||i>=rows||j>=cols){
            return;
        }
 
        if(visited[i][j])
            return;
 
        temp += board[i][j];
 
        if(trie.startsWith(temp) == false)
            return;
 
        if(trie.search(temp)){
            set.add(temp);
        }
 
        visited[i][j]=true;
        findWords(board, visited, temp, i-1, j, trie);
        findWords(board, visited, temp, i+1, j, trie);
        findWords(board, visited, temp, i, j-1, trie);
        findWords(board, visited, temp, i, j+1, trie);
        visited[i][j]=false;
    }
}