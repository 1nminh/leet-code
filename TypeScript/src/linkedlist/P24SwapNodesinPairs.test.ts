import { describe, it, expect } from "vitest";
import { ListNode, swapPairs } from "./P24SwapNodesinPairs";

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

describe("P24 Swap Nodes in Pairs", () => {
  it("should return [2,1,4,3] for [1,2,3,4]", () => {
    const head = toLinkedList([1, 2, 3, 4]);
    expect(toArray(swapPairs(head))).toEqual([2, 1, 4, 3]);
  });
  it("should return [1] for [1]", () => {
    const head = toLinkedList([1]);
    expect(toArray(swapPairs(head))).toEqual([1]);
  });
  it("should return [] for []", () => {
    const head = toLinkedList([]);
    expect(toArray(swapPairs(head))).toEqual([]);
  });
  it("should return [2,1,3] for [1,2,3]", () => {
    const head = toLinkedList([1, 2, 3]);
    expect(toArray(swapPairs(head))).toEqual([2, 1, 3]);
  });
  it("should return [2,1,4,3] for [1,2,3,4]", () => {
    const head = toLinkedList([1, 2, 3, 4]);
    expect(toArray(swapPairs(head))).toEqual([2, 1, 4, 3]);
  });
  it("should return [2,1,4,3] for [1,2,3,4]", () => {
    const head = toLinkedList([1, 2, 3, 4]);
    expect(toArray(swapPairs(head))).toEqual([2, 1, 4, 3]);
  });
});
