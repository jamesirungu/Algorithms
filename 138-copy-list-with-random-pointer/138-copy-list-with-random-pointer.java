/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map= new HashMap<>();
        Node current = head;
        while(current != null){
            Node newCopy = addToMap(current,map);
            Node newCopyNext = addToMap(current.next,map);
            Node newCopyRandom = addToMap(current.random,map);
            current = current.next;
            newCopy.next = newCopyNext;
            newCopy.random = newCopyRandom;
        }
        return map.get(head); 
    }
    public Node addToMap(Node oldNode,Map<Node,Node> map){
        if(oldNode == null)
            return null;
        map.putIfAbsent(oldNode,new Node(oldNode.val));
        return  map.get(oldNode);
    }
}