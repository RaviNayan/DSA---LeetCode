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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode temp = head;
        ListNode tempcpy = head;

        while (temp != null) {
            if (tempcpy.val != temp.val) {
                tempcpy.next = temp;
                tempcpy = temp;
            }
            temp = temp.next;
        }

        tempcpy.next = null;

        return head;
    }
}