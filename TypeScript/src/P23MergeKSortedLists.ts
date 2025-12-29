/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function mergeKLists(lists: Array<ListNode | null>): ListNode | null {

  
  return null;
}

console.log("Problem 23: Merge k Sorted Lists");
console.log(mergeKLists([])); // []
console.log(mergeKLists([null])); // []
console.log(
  mergeKLists([
    new ListNode(1, new ListNode(4, new ListNode(5))),
    new ListNode(1, new ListNode(3, new ListNode(4))),
    new ListNode(2, new ListNode(6)),
  ])
); // [1,1,2,3,4,4,5,6]
console.log(
  mergeKLists([
    new ListNode(-2, new ListNode(-1, new ListNode(-1))),
    null,
    new ListNode(-3, new ListNode(-3, new ListNode(-2))),
  ])
); // [-3,-3,-2,-2,-1,-1]



