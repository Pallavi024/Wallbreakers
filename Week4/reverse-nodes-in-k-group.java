/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
     public static ListNode reverse(ListNode head) {
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
    public ListNode reverseKGroup(ListNode head, int k) {
       
     if(head == null || head.next == null)
            return head;
        
       ListNode temp = head;
        int count = 1;
        while(count < k && temp!= null)
        {
            temp=temp.next;
            count++;
        }
        if(temp == null)
            return head;
        ListNode newhead = temp.next;
        temp.next = null;
        ListNode reverseHeadrecursive = reverseKGroup(newhead,k);
        ListNode reverseHead = reverse(head);
        ListNode temp2 = reverseHead;
        while(temp2.next!= null)
            temp2 = temp2.next;
        temp2.next = reverseHeadrecursive;
        return reverseHead;
         
    }
}