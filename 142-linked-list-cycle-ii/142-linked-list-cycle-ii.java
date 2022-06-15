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