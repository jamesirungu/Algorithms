//2 data structures - 
class LRUCache {
    class Node{
        int val;
        int key;
        Node previous;
        Node next;
        public Node(int val,int key){
            this.val=val;
            this.key=key;
        }
         public Node(){
        }
    }
    Map<Integer,Node> map=new HashMap<>();
    Node head;
    Node tail;
    int capacity;
        
    public LRUCache(int capacity) {
        head=new Node();
        tail =new Node();
        head.next=tail;
        head.previous=null;
        tail.next=null;
        tail.previous=head;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node nodeToprioritize=map.get(key);
            remove(nodeToprioritize);
            put(key,nodeToprioritize.val);
            return nodeToprioritize.val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.previous);     
        }
        Node currNode=new Node(value,key);
        currNode.next=head.next;
        currNode.previous=head;
        currNode.next.previous=currNode;
        head.next=currNode;
        map.put(key,currNode);        
    }
    public void remove(Node toRemove){
        System.out.println(toRemove.key);
        if(toRemove==null){
            return;
        }
        map.remove(toRemove.key);
        toRemove.previous.next=toRemove.next;
        toRemove.next.previous=toRemove.previous;
    }
}

