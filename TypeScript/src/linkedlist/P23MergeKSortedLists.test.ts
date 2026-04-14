import { describe, it, expect } from 'vitest';
import { ListNode, mergeKLists } from './P23MergeKSortedLists';

function toArray(head: ListNode | null): number[] {
  const result: number[] = [];
  let current = head;
  while (current) {
    result.push(current.val);
    current = current.next;
  }
  return result;
}

describe('P23 Merge K Sorted Lists', () => {
  it('should return null for empty array', () => {
    expect(mergeKLists([])).toBeNull();
  });

  it('should return null for [null]', () => {
    expect(mergeKLists([null])).toBeNull();
  });
});
