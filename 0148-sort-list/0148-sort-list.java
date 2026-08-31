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
    public ListNode findMiddle(ListNode head) {
        ListNode fast = head, slow = head;
        while ( fast.next != null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode ms(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode middle = findMiddle(head);
        ListNode leftHead = head, rightHead = middle.next;
        middle.next = null;
        leftHead = ms(leftHead);
        rightHead = ms(rightHead);
        return merge(leftHead, rightHead);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (left != null && right != null) {
            if (left.val < right.val) {
                temp.next = left;
                temp = left;
                left = left.next;
            } else {
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }
        if (left!=null)
            temp.next = left;
        else
            temp.next = right;

        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        ListNode temp = ms(head);
        return temp;
    }
}