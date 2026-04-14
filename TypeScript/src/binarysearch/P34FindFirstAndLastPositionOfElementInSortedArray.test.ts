import { describe, it, expect } from 'vitest';
import { searchRange } from './P34FindFirstAndLastPositionOfElementInSortedArray';

describe('P34 Find First and Last Position of Element in Sorted Array', () => {
  it('should return [3,4] for [5,7,7,8,8,10] with target 8', () => {
    expect(searchRange([5, 7, 7, 8, 8, 10], 8)).toEqual([3, 4]);
  });

  it('should return [-1,-1] for [5,7,7,8,8,10] with target 6', () => {
    expect(searchRange([5, 7, 7, 8, 8, 10], 6)).toEqual([-1, -1]);
  });

  it('should return [-1,-1] for [] with target 0', () => {
    expect(searchRange([], 0)).toEqual([-1, -1]);
  });
});
