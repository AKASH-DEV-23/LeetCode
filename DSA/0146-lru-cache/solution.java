class LRUCache {
    class ListNode{
        int key;
        int value;
        ListNode prev;
        ListNode next;

        public ListNode(){}
        public ListNode(int key, int value){
            this.key=key;
            this.value=value;
        }
    }
    ListNode head;
    ListNode tail;
    int capacity;
    int size;
    Map<Integer,ListNode> mp;
    public LRUCache(int capacity) {
        head=new ListNode();
        tail=new ListNode();
        head.next=tail;
        tail.prev=head;
        mp=new HashMap<>();
        this.capacity=capacity;
        this.size=0;
    }
    
    public int get(int key) {
        if(!mp.containsKey(key))    return -1;
        ListNode node=mp.get(key);
        removeNode(node);
        addFirst(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            ListNode node=mp.get(key);
            node.value=value;
            removeNode(node);
            addFirst(node);
            mp.put(key,node);
        }else{
            ListNode newNode=new ListNode(key,value);
            addFirst(newNode);
            mp.put(key,newNode);
            size++;
        }
        if(size>capacity){
            ListNode temp=tail.prev;
            removeNode(temp);
            mp.remove(temp.key);
            size--;
        }
    }
    private void removeNode(ListNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void addFirst(ListNode node){
        node.prev=head;
        node.next=head.next;
        head.next=node;
        node.next.prev=node;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
