class MyHashSet {

    /** Initialize your data structure here. */
    int hashset[];
    public MyHashSet() {
        hashset = new int[1000001];
        Arrays.fill(hashset,-1);
    }
    
    public void add(int key) {
        
        
        hashset[key] = key;
        
    }
    
    public void remove(int key) {
     hashset[key] = -1;   
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(hashset[key]!= -1)
            return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */