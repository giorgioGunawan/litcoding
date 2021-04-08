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
    public ListNode mergeKLists(ListNode[] lists){
        if(!nullList(lists)){
            return null;
        }
        var llFinal = new ListNode();
        traverseAndCopy(lists, llFinal, null);
        return llFinal;
    }
    private void traverseAndCopy(ListNode[] lists, ListNode llFinal, ListNode llFinalPrev){
        
        //System.out.println("A");
        if(!nullList(lists)){
            llFinalPrev.next = null;
            return;
        }
        
        int minIndex = 0;
        for(int i = 1; i < lists.length; i++){
            if(lists[i] != null){
                if(lists[minIndex] == null)
                    minIndex = i;
                if(lists[i].val < lists[minIndex].val)
                    minIndex = i;
            }
        }
        llFinal.val = lists[minIndex].val;
        lists[minIndex] = lists[minIndex].next;
        llFinal.next = new ListNode();
        traverseAndCopy(lists, llFinal.next, llFinal);
    }
    
    private boolean nullList(ListNode[] lists){
        
        boolean nonNull = false;
        for(var list : lists){
            if(list == null)
                continue;
            if(list != null){
                nonNull = true;
                break;
            }
        }
        return nonNull;
    }
}
