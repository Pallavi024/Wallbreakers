 class TrieNode{

	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}


public class Trie {

	private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
		count = 0;
	}	

	private boolean add(TrieNode root, String word){
		if(word.length() == 0){
			if (!root.isTerminating) {
				root.isTerminating = true;
				return true;
			} else {
				return false;
			}
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		return add(child, word.substring(1));

	}

	public void add(String word){
		if (add(root, word)) {
			this.count++;
		}
	}
  
  	public boolean search(TrieNode root,String word){
      if(word.length() == 0 && root.isTerminating == true)
      {
        return true;
      }
      int childIndex = word.charAt(0) - 'a';
      TrieNode child = root.children[childIndex];
      if(child == null)
        return false;
      if(word.charAt(0) == child.data)
      {
        return search(child,word.substring(1));
      }
      
      return false;
    }
    public boolean search(String word){
		// add your code here
      
      return search(root,word);
	}
   
    public boolean LongestWord(String word)
    {
            TrieNode currNode = root;
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                int index = chars[i] - 'a';
                if (currNode.children[index] == null) {
                    return false;
                }
                currNode = currNode.children[index];
                if (!currNode.isTerminating) {
                    return false;
                }
            }
            return true;
        }
    }
   



class Solution {
   

    public String longestWord(String[] words) {
        
        Trie trie = new Trie();
        for(int i=0;i<words.length;i++)
            trie.add(words[i]);
         String ans = "";
        for (String word : words) {
        
            if (word.length() < ans.length()
                    || (word.length() == ans.length() && word.compareTo(ans) > 0)) {
                continue;
            }
            if (trie.LongestWord(word)) {
                ans = word;
            }
        }
        return ans;
    }
}