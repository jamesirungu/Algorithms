/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
/*
	* traverse through the list to the nth position
	* while at the nth position, start a new pointer for the node to be deleted alongside traversal pointer
	* when the node to be removed is at level head.next, let the node to be previous node be pointed to head
	* finally the removal of node will be gotten by pointing previos node next to removal node next attribute
	* incase the previous.next is the same as removal node .next, return head. it means there was no traversal/list is short
*/
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
            return null;
        ListNode prevNode=head;
        ListNode removalNode=head;  
        ListNode traversalNode=head;     
           
        int i=1;
        while(traversalNode.next!=null){   
            traversalNode=traversalNode.next;
            if(i>=n){
                prevNode=removalNode;
                removalNode=prevNode.next;
                            
            }
            i++;
            
        }             
        if(prevNode.next==removalNode.next){
            head=head.next;
            return head;
        }
        prevNode.next=removalNode.next;
        return head;        
    }
}