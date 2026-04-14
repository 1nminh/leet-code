package org.adler.linkedlist;

// Time: O(max(m,n)), Space: O(max(m,n)) // Approach: Simultaneous traversal with carry
public class P2AddTwoNumbers {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
    }
}
