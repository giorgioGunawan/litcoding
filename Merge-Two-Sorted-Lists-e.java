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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null){
            return null;
        }
        var llFinal = new ListNode();
        traverseAndCopy(l1, l2, llFinal, null);
        return llFinal;
    }
    
    private void traverseAndCopy(ListNode l1, ListNode l2, ListNode llFinal, ListNode llFinalPrev){
        
        if(l1 == null && l2 == null){
            llFinalPrev.next = null;
            return;
        }else if(l1 != null && l2 == null){
            llFinal.val = l1.val;
            llFinal.next = new ListNode();
            traverseAndCopy(l1.next, l2, llFinal.next,llFinal);
        }else if(l1 == null && l2 != null){
            llFinal.val = l2.val;
            llFinal.next = new ListNode();
            traverseAndCopy(l1, l2.next, llFinal.next,llFinal);
        }else{
            if(l2.val < l1.val){
                llFinal.val = l2.val;
                llFinal.next = new ListNode();
                traverseAndCopy(l1, l2.next, llFinal.next,llFinal);
            }else{
                llFinal.val = l1.val;
                llFinal.next = new ListNode();
                traverseAndCopy(l1.next, l2, llFinal.next,llFinal);
            }
        }
    }
}
