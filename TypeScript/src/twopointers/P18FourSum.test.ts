import { describe, it, expect } from 'vitest';
import { fourSum } from './P18FourSum';

describe('P18 Four Sum', () => {
  it('should return [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]] for [1,0,-1,0,-2,2] with target 0', () => {
    expect(fourSum([1, 0, -1, 0, -2, 2], 0)).toEqual([
      [-2, -1, 1, 2],
      [-2, 0, 0, 2],
      [-1, 0, 0, 1],
    ]);
  });

  it('should return [[2,2,2,2]] for [2,2,2,2,2] with target 8', () => {
    expect(fourSum([2, 2, 2, 2, 2], 8)).toEqual([[2, 2, 2, 2]]);
  });
});
