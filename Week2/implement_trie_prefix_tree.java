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

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */