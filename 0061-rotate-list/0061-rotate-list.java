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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int cnt = 1;
        while (temp.next != null) {
            cnt++;
            temp = temp.next;
        }
        int n = cnt - (k % cnt);
        temp.next = head;
        ListNode tail = temp;
        for (int i = 0; i < n; i++) {
            tail = head;
            head = head.next;
        }
        tail.next = null;
        return head;
    }
}