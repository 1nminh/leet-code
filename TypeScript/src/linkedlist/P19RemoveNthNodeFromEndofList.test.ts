import { describe, it, expect } from 'vitest';
import { ListNode, removeNthFromEnd } from './P19RemoveNthNodeFromEndofList';

function toLinkedList(arr: number[]): ListNode | null {
  if (arr.length === 0) return null;
  const head = new ListNode(arr[0]);
  let current = head;
  for (let i = 1; i < arr.length; i++) {
    current.next = new ListNode(arr[i]);
    current = current.next;
  }
  return head;
}

function toArray(head: ListNode | null): number[] {
  const result: number[] = [];
  let current = head;
  while (current) {
    result.push(current.val);
    current = current.next;
  }
  return result;
}

describe('P19 Remove Nth Node From End of List', () => {
  it('should return [1,2,3,5] for [1,2,3,4,5] with n=2', () => {
    const head = toLinkedList([1, 2, 3, 4, 5]);
    expect(toArray(removeNthFromEnd(head, 2))).toEqual([1, 2, 3, 5]);
  });

  it('should return [] for [1] with n=1', () => {
    const head = toLinkedList([1]);
    expect(toArray(removeNthFromEnd(head, 1))).toEqual([]);
  });

  it('should return [1] for [1,2] with n=1', () => {
    const head = toLinkedList([1, 2]);
    expect(toArray(removeNthFromEnd(head, 1))).toEqual([1]);
  });
});
