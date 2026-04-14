package org.adler.linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class P21MergeTwoSortedListsTest {

    private P21MergeTwoSortedLists.ListNode buildList(int... vals) {
        P21MergeTwoSortedLists.ListNode dummy = new P21MergeTwoSortedLists.ListNode(0);
        P21MergeTwoSortedLists.ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new P21MergeTwoSortedLists.ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    private List<Integer> toList(P21MergeTwoSortedLists.ListNode node) {
        List<Integer> result = new ArrayList<>();
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        return result;
    }

    @Test
    void testMergeTwoNonEmptyLists() {
        P21MergeTwoSortedLists.ListNode l1 = buildList(1, 2, 4);
        P21MergeTwoSortedLists.ListNode l2 = buildList(1, 3, 4);
        assertEquals(List.of(1, 1, 2, 3, 4, 4), toList(P21MergeTwoSortedLists.mergeTwoLists(l1, l2)));
    }

    @Test
    void testBothEmpty() {
        assertNull(P21MergeTwoSortedLists.mergeTwoLists(null, null));
    }

    @Test
    void testOneEmpty() {
        P21MergeTwoSortedLists.ListNode l2 = buildList(0);
        assertEquals(List.of(0), toList(P21MergeTwoSortedLists.mergeTwoLists(null, l2)));
    }

    @Test
    void testFirstEmpty() {
        P21MergeTwoSortedLists.ListNode l1 = buildList(1, 2, 3);
        assertEquals(List.of(1, 2, 3), toList(P21MergeTwoSortedLists.mergeTwoLists(l1, null)));
    }
}
