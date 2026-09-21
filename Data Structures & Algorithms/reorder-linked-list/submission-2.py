# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        if not head or not head.next:
            return
        
        slow,fast = head,head

        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next


        second = slow.next
        slow.next = None

        prev = None
        curr = second

        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next

        second = prev

        first = head

        while second:
            tmp1 = first.next
            tmp2 = second.next

            first.next = second
            second.next = tmp1

            first = tmp1
            second = tmp2
        