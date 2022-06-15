/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /*
     Initializa a hashmap and keep adding nodes to it as you traverse
     before adding each node, confrm if it contains the node which is set as key(complexity of contains key is O(1)
     if it contains the key node, return the node
     if traversaql is complete with no cases of map containing the key, return null
    */
    public ListNode detectCycle(ListNode head) {
        ListNode traversalPointer=head;
        Map<ListNode,Integer> visited = new HashMap<>();
        
        int i=0;
        while(traversalPointer!=null){
            if(visited.containsKey(traversalPointer)){
                return traversalPointer;
            }
            visited.put(traversalPointer,i);
            traversalPointer=traversalPointer.next;
            i++;
        }
        
        return null;
    }
}