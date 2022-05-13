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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null ){
            return l2;
        }
        if( l2 == null){
            return l1;
        }
        ListNode temp = new ListNode();
        ListNode current = temp;
        int carry = 0;
        while(l1 !=  null || l2 !=  null || carry != 0){
            int val1 = 0;
            if(l1 !=null){
                val1 = l1.val;
                l1 = l1.next;
            }
            int val2 = 0;
            if(l2 !=null){
                val2 = l2.val;
                l2 = l2.next;
             }
            int sum = val1+val2+carry; 
            int newVal = sum%10; // to get reminder value
            current.next = new ListNode(newVal);
            current = current.next;
            carry = sum/10; /// to get carry value
        }
        return temp.next;
    }
}