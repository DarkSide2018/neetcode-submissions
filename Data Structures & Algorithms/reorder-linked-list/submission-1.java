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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        // 1. find the middle of the list
        while(fast != null && fast.next !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf;

        if(fast == null){
            secondHalf =slow;
            prev.next = null;
        }else{
            secondHalf = slow.next;
            slow.next = null;
        }

        ListNode reversedSecond = reverseList(secondHalf);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode p1 = firstHalf;
        ListNode p2 = reversedSecond;

        while(p1 != null || p2 != null){
            if(p1 != null){
                curr.next = p1;
                curr = curr.next;
                p1 = p1.next;
            }

            if(p2 != null){
                curr.next = p2;
                curr = curr.next;
                p2 = p2.next;
            }
        }
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr !=null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
