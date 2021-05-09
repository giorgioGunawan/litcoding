# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        first = ListNode()
        second = ListNode()
        third = ListNode()
        
        dummy = ListNode(99, head)
        first = dummy
        second = dummy
        third = dummy
        
        # now make third go n+1 distance away
        # and make second go 2 distance away
        for i in range(n+1):
            third = third.next
        for i in range(2):
            second = second.next
        
        # now make one, two and three move till third is none
        while(third != None):
            first = first.next
            second = second.next
            third = third.next
        
        first.next = second
        return dummy.next
        
        
        
