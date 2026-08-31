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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), temp = dummy;
        ListNode t1 = l1, t2 = l2;
        int s = 0, c = 0;
        while (t1 != null || t2 != null || c != 0) {
            if (t1 != null) {
                s += t1.val;
                t1 = t1.next;
            }
            if (t2 != null) {
                s += t2.val;
                t2 = t2.next;
            }
            s += c;
            c = s / 10;
            ListNode n = new ListNode(s % 10);
            s=0;
            temp.next = n;
            temp = temp.next;
        }
        return dummy.next;
    }
}