 class Node {
        int key;
        int val;
        Node next;
        Node prev;
    }
class LRUCache {
    
    Node head;
    Node tail;
    int capacity;
    int currentNumber;
    HashMap<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.prev = null;
        head.next = tail;
        tail.prev = head;
        tail.next = null;
        map = new HashMap<Integer, Node>();
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
        return node.val;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            if (currentNumber == capacity) {
                Node endNode = tail.prev;
                endNode.prev.next = tail;
                tail.prev = endNode.prev;
                map.remove(endNode.key);
                currentNumber -= 1;
            }
            node = new Node();
            node.key = key;
            node.val = value;
            currentNumber += 1;
            map.put(key, node);
        } else {
            node.val = value;
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */