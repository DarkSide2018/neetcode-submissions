/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
 fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy: ListNode? = ListNode(-1)
        var current: ListNode? = dummy
        var list1Cycle = list1
        var list2Cycle = list2

        while (list1Cycle != null && list2Cycle != null) {
            if (list1Cycle.`val` <= list2Cycle.`val` ){
                current?.next = list1Cycle
                list1Cycle = list1Cycle.next
            }else{
                current?.next = list2Cycle
                list2Cycle = list2Cycle.next
            }
            current = current?.next
        }

        if (list1Cycle != null) {
            current?.next = list1Cycle
        } else if(list2Cycle != null) {
            current?.next = list2Cycle
        }

        return dummy?.next
    }
}
