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