public class Solution {
    public boolean hasCycle(ListNode head) {
        var set = new HashSet<ListNode>();
        while(head != null){
            if(set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
