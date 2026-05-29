export class ListNode {
  val: number;
  next: ListNode | null;
  constructor(val?: number, next?: ListNode | null) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

export function swapPairs(head: ListNode | null): ListNode | null {
  const dummy = new ListNode(0, head);
  let prev: ListNode = dummy;

  while (prev.next && prev.next.next) {
    const first = prev.next;
    const second = prev.next.next;

    first.next = second.next;
    second.next = first;
    prev.next = second;

    prev = first;
  }

  return dummy.next;
}
