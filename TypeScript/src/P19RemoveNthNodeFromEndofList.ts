class ListNode {
  val: number;
  next: ListNode | null;
  constructor(val?: number, next?: ListNode | null) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

function removeNthFromEnd(head: ListNode | null, n: number): ListNode | null {
  const dummy = new ListNode(0, head);
  let first: ListNode | null = dummy;
  let second: ListNode | null = dummy;

  for (let i = 0; i <= n; i++) {
    if (first) first = first.next;
  }

  while (first) {
    first = first.next;
    if (second) second = second.next;
  }

  if (second && second.next) {
    second.next = second.next.next;
  }

  return dummy.next;
}

console.log("Problem 19:");
console.log(
  removeNthFromEnd(
    new ListNode(
      1,
      new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))
    ),
    2
  )
); // [1,2,3,5]
console.log(removeNthFromEnd(new ListNode(1), 1)); // []
console.log(removeNthFromEnd(new ListNode(1, new ListNode(2)), 1)); // [1]
console.log(removeNthFromEnd(new ListNode(1, new ListNode(2)), 2)); // [2]
