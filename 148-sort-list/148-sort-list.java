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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return head;
        }
                      
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            curr= curr.next;
            n++;
        }
        int[] arr= new int[n];
        
        ListNode currNode=head;
        int k=0;
        while(currNode!=null){
            
            arr[k]=currNode.val;
            k++;
            currNode=currNode.next;
        }
        
        
//         boolean madeSwap=true;
//         while(madeSwap){
//             madeSwap=false;
//             for(int i=0; i<arr.length-1;i++){
//                 if(arr[i]>arr[i+1]){
//                     int temp=arr[i];
//                     arr[i]=arr[i+1];
//                     arr[i+1]=temp;
//                     madeSwap=true;
//                 }                
//             }
            
//         }
        
        Arrays.sort(arr);
        ListNode cur=head;
        int i=0;
        while(cur!=null){
            cur.val=arr[i];
            i++;
            cur=cur.next;
        }
          
        return head;
    }
}