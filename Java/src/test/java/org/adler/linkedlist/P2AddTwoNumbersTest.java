package org.adler.linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class P2AddTwoNumbersTest {

    private P2AddTwoNumbers.ListNode buildList(int... vals) {
        P2AddTwoNumbers.ListNode dummy = new P2AddTwoNumbers.ListNode(0);
        P2AddTwoNumbers.ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new P2AddTwoNumbers.ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    private List<Integer> toList(P2AddTwoNumbers.ListNode node) {
        List<Integer> result = new ArrayList<>();
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        return result;
    }

    @Test
    void testBasicAddition() {
        P2AddTwoNumbers.ListNode l1 = buildList(2, 4, 3);
        P2AddTwoNumbers.ListNode l2 = buildList(5, 6, 4);
        assertEquals(List.of(7, 0, 8), toList(P2AddTwoNumbers.addTwoNumbers(l1, l2)));
    }

    @Test
    void testBothZeros() {
        P2AddTwoNumbers.ListNode l1 = buildList(0);
        P2AddTwoNumbers.ListNode l2 = buildList(0);
        assertEquals(List.of(0), toList(P2AddTwoNumbers.addTwoNumbers(l1, l2)));
    }

    @Test
    void testDifferentLengthsWithCarry() {
        P2AddTwoNumbers.ListNode l1 = buildList(9, 9, 9);
        P2AddTwoNumbers.ListNode l2 = buildList(9, 9);
        assertEquals(List.of(8, 9, 0, 1), toList(P2AddTwoNumbers.addTwoNumbers(l1, l2)));
    }

    @Test
    void testSingleDigitCarry() {
        P2AddTwoNumbers.ListNode l1 = buildList(5);
        P2AddTwoNumbers.ListNode l2 = buildList(5);
        assertEquals(List.of(0, 1), toList(P2AddTwoNumbers.addTwoNumbers(l1, l2)));
    }
}
