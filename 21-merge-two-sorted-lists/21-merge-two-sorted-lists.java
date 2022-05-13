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
    //loop through the lists at the same time
    //compare the value of nodes at every iteration i of both lists
    //if val of node i of list1 is smaller than val of nod i in list2, 
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode newList=new ListNode();
        ListNode current=newList;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                current.next=list1;
                list1=list1.next;
                current=current.next;
            }
            else{
                current.next=list2;
                list2=list2.next;
                current=current.next;
            }
        }
        current.next=(list1!=null)?list1:list2;
        return newList.next;
    }
}