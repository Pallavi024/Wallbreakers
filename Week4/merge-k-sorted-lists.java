/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
     public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> priorityqueue = new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode o1, ListNode o2){
                return o1.val - o2.val;
            }
        });
        ListNode head = new ListNode(0);
        ListNode tail = head;
        for(ListNode list : lists){
            if(list != null){
                priorityqueue.add(list);
            }
        }
        while(priorityqueue.size() != 0){
            ListNode temp = priorityqueue.remove();
            tail.next = temp;
            tail = tail.next;
            if(temp.next != null){
                priorityqueue.add(temp.next);
            }
        }
        return head.next;
    }
    }
