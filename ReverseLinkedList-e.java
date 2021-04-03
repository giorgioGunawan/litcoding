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
    public ListNode reverseList(ListNode head) {
        
        return recursionReverse(head, null);
        //return head;
    }
    

    private ListNode recursionReverse(ListNode head, ListNode prev){
        
        if(head == null){
            return prev;
        }
        ListNode nxt = head.next;
        head.next = prev;
        return recursionReverse(nxt, head);
    }
}
