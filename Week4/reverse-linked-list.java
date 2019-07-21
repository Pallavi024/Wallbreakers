/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
     ListNode curr=head,prev=null,temp=head.next;
      while(curr !=null){
        curr.next=prev;
        prev=curr;
        curr=temp;
        if(temp !=null)
        temp=temp.next;
      }
      return prev;   
    }
}