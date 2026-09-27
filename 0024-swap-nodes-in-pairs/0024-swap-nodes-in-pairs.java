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
    public ListNode swap(ListNode head, ListNode pair){
        ListNode temp = head, k = pair.next;
        temp = temp.next;
        temp.next=head;
        head.next = k;
        return temp;
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            ListNode swapped = swap(temp, temp.next);
            prev.next = swapped;
            prev = temp;
            temp = temp.next;
        }

        return dummy.next;
    }
}