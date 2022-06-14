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
    //distance from head to k = distance fron k to tail
    //move the first pointer to k
    //move both the first pointer from k to the end another pointer from head until a point where the 1st pointer gets to end
    //move the 3rd pointer to k
    //swap the values of nodes where the 2nd and 3rd pointers are
    public ListNode swapNodes(ListNode head, int k) {
        ListNode traversalNode=head;
        ListNode rearSwapNode=head;
        ListNode frontSwapNode=head;
        
        int i=1;
        while(i<k){
            traversalNode=traversalNode.next;
            i++;
        }
        
        while(traversalNode.next!=null){
            frontSwapNode=frontSwapNode.next;
            traversalNode=traversalNode.next;    
        }
        
         int j=1;
         while(j<k){            
            rearSwapNode=rearSwapNode.next;
             j++;
        }              
               
        int val= rearSwapNode.val;
        rearSwapNode.val=frontSwapNode.val;
        frontSwapNode.val=val;
        
        
        return head;
        
    }
}