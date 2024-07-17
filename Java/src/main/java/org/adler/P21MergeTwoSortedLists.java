package org.adler;

public class P21MergeTwoSortedLists {
    public static void main(String[] args) {
        System.out.println("Problem 21");

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create second linked list: list2 = [1, 3, 4]
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        printList(list1);
        printList(list2);
        mergeTwoLists(list1, list2);
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergListNode = new ListNode();
        mergListNode.val = Math.min(list1.val, list2.val);

        return mergListNode;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}
